package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureAssocMoleculeDetailsDataTests extends GroovyTestCase {

    private def testData = "TEST"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new LiteratureAssocMoleculeDetailsData(molecule: testData)
        b.save()

        def t = new LiteratureAssocMoleculeDetailsData(molecule: testData)
        assertEquals testData, b.molecule
    }
}
