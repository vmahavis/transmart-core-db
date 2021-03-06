package org.transmartproject.db.ontology

import grails.orm.HibernateCriteriaBuilder
import grails.util.Holders
import org.transmartproject.core.ontology.OntologyTerm
import org.transmartproject.core.ontology.OntologyTerm.VisualAttributes
import org.transmartproject.db.concept.ConceptKey

class TableAccess extends AbstractQuerySpecifyingType implements
        OntologyTerm, Serializable {

    Integer      level
    String       fullName
    String       name

    String       tableName

    String       tableCode
    Character    cProtectedAccess
    Character    cSynonymCd = 'N'
    String       cVisualattributes = ''

    BigDecimal   cTotalnum
    String       cBasecode
    String       cMetadataxml
    String       cComment
    String       tooltip
    Date         cEntryDate
    Date         cChangeDate
    Character    cStatusCd
    String       valuetypeCd

	static mapping = {
        table   'table_access'
		version false

        /* hibernate needs an id, see
         * http://docs.jboss.org/hibernate/orm/3.3/reference/en/html/mapping.html#mapping-declaration-id
         */
        id          composite: ['tableCode']

        fullName             column:   'C_FULLNAME'
        level                column:   'C_HLEVEL'
        name                 column:   'C_NAME'
        tooltip              column:   'C_TOOLTIP'
        tableName            column:   'C_TABLE_NAME'
        tableCode            column:   'C_TABLE_CD'

        factTableColumn      column:   'C_FACTTABLECOLUMN'
        dimensionTableName   column:   'C_DIMTABLENAME'
        columnName           column:   'C_COLUMNNAME'
        columnDataType       column:   'C_COLUMNDATATYPE'
        operator             column:   'C_OPERATOR'
        dimensionCode        column:   'C_DIMCODE'
	}

	static constraints = {
        tableCode           maxSize:    50
        tableName           maxSize:    50
        cProtectedAccess    nullable:   true
        fullName            maxSize:    700
        name                maxSize:    2000
        cSynonymCd          nullable:   true
        cVisualattributes   maxSize:    3
        cTotalnum           nullable:   true
        cBasecode           nullable:   true,   maxSize:   50
        cMetadataxml        nullable:   true
        cComment            nullable:   true
        tooltip             nullable:   true,   maxSize:   900
        cEntryDate          nullable:   true
        cChangeDate         nullable:   true
        cStatusCd           nullable:   true
        valuetypeCd         nullable:   true,   maxSize:   50

        AbstractQuerySpecifyingType.constraints.delegate = delegate
        AbstractQuerySpecifyingType.constraints()
	}

    static List<OntologyTerm> getCategories(showHidden = false,
                                            showSynonyms = false) {
        withCriteria {
            if (!showHidden) {
                not { like 'cVisualattributes', '_H%' }
            }
            if (!showSynonyms) {
                eq 'cSynonymCd', 'N' as char
            }
        }
    }

    Class getOntologyTermDomainClassReferred()
    {
        def domainClass = Holders.getGrailsApplication().domainClasses.find
                {
                    AbstractI2b2Metadata.class.isAssignableFrom(it.clazz) &&
                            tableName.equalsIgnoreCase(it.clazz.backingTable)
                }
        domainClass?.clazz
    }

    ConceptKey getConceptKey() {
        new ConceptKey(tableCode, fullName)
    }

    @Override
    String getKey() {
        conceptKey.toString()
    }

    @Override
    EnumSet<VisualAttributes> getVisualAttributes() {
        AbstractI2b2Metadata.convertVisualAttributesString(cVisualattributes)
    }

    @Override
    List<OntologyTerm> getChildren(boolean showHidden = false,
                                   boolean showSynonyms = false) {
        HibernateCriteriaBuilder c

        /* extract table code from concept key and resolve it to a table name */
        c = TableAccess.createCriteria()
        String tableName = c.get {
            projections {
                distinct('tableName')
            }
            eq('tableCode', this.conceptKey.tableCode)
        }

        /* validate this table name */
        def domainClass = this.ontologyTermDomainClassReferred
        if (!domainClass) {
            throw new RuntimeException("Metadata table ${tableName} is not " +
                    "mapped")
        }

        /* select level on the original table (is this really necessary?) */
        c = domainClass.createCriteria();
        Integer parentLevel = c.get {
            projections {
                property 'level'
            }

            and {
                eq 'fullName', fullName
                eq 'cSynonymCd', 'N' as char
            }
        }
        if (parentLevel == null)
            throw new RuntimeException("Could not determine parent's level; " +
                    "could not find it in ${domainClass}'s table (fullname: " +
                    "$fullName)")

        /* Finally select the relevant stuff */
        def fullNameSearch = fullName + '%'

        /* XXX: for some reason this is necessary. Should be investigated */
        fullNameSearch = fullNameSearch.replaceAll('\\\\', '\\\\\\\\')

        c = domainClass.createCriteria()
        c.list {
            and {
                like 'fullName', fullNameSearch
                eq 'level', parentLevel + 1
                if (!showHidden) {
                    not { like 'cVisualattributes', '_H%' }
                }
                if (!showSynonyms) {
                    eq 'cSynonymCd', 'N' as char
                }
            }
            order('name')
        }
    }

    @Override
    String toString() {
        getClass().canonicalName + "[${attached?'attached':'not attached'}" +
                "] [ fullName=$fullName ]"
    }
}
