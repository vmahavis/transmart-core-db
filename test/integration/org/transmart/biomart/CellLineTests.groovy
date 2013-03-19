package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class CellLineTests extends GroovyTestCase {

    private def testData = 10000
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new CellLine(bioDiseaseId: testData)
        b.save()

        def t = new CellLine(bioDiseaseId: testData)
        assertEquals testData, b.bioDiseaseId
    }
}