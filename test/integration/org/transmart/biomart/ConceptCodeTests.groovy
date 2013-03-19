package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class ConceptCodeTests extends GroovyTestCase {

    private def testData = "OTHER"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new ConceptCode(bioConceptCode: testData)
        b.save()

        def t = new ConceptCode(bioConceptCode: testData)
        assertEquals testData, b.bioConceptCode
    }
}