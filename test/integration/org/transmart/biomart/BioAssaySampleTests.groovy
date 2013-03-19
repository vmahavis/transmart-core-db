package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioAssaySampleTests extends GroovyTestCase {

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
        def b = new BioAssaySample(bioAssayId: testData)
        b.save()

        def t = new BioAssaySample(bioAssayId: testData)
        assertEquals testData, b.bioAssayId
    }
}

