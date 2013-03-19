package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioAssayDataStatisticsTests extends GroovyTestCase {

    private def testData = 20
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new BioAssayDataStatistics(sampleCount: testData)
        b.save()

        def t = new BioAssayDataStatistics(sampleCount: testData)
        assertEquals testData, b.sampleCount
    }
}
