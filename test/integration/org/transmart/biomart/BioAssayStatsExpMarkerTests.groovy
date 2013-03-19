package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioAssayStatsExpMarkerTests extends GroovyTestCase {

    private def testData = new BioMarker(name: "TEST")
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new BioAssayStatsExpMarker(marker: testData)
        b.save()

        def t = new BioAssayStatsExpMarker(marker: testData)
        assertEquals testData, b.marker
    }
}
