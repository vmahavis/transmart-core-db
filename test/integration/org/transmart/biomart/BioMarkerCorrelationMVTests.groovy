package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioMarkerCorrelationMVTests extends GroovyTestCase {

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
        def b = new BioMarkerCorrelationMV(bioMarkerId: testData)
        b.save()

        def t = new BioMarkerCorrelationMV(bioMarkerId: testData)
        assertEquals testData, b.bioMarkerId
    }
}
