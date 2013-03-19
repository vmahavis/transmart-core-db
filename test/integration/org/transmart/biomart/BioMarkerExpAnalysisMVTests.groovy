package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioMarkerExpAnalysisMVTests extends GroovyTestCase {

    private def testData  = new BioMarker(name: "TEST")
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new BioMarkerExpAnalysisMV(marker: testData)
        b.save()

        def t = new BioMarkerExpAnalysisMV(marker: testData)
        assertEquals testData, b.marker

    }
}
