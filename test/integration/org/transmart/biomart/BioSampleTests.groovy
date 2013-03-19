package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioSampleTests extends GroovyTestCase {

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
        def b = new BioSample(type: testData)
        b.save()

        def t = new BioSample(type: testData)
        assertEquals testData, b.type
    }
}
