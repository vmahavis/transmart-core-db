package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioAssayAnalysisDataTests extends GroovyTestCase {

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
        def b = new BioAssayAnalysisData(featureGroupName: testData)
        b.save()

        def t = new BioAssayAnalysisData(featureGroupName: testData)
        assertEquals testData, b.featureGroupName
    }
}
