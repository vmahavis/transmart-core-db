package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioAssayAnalysisPlatformTests extends GroovyTestCase {

    private def testData = "Omicsoft Corporation"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new BioAssayAnalysisPlatform(platformName: testData)
        b.save()

        def t = new BioAssayAnalysisPlatform(platformName: testData)
        assertEquals testData, b.platformName
    }
}
