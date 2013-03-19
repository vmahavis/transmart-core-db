package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioMarkerTests extends GroovyTestCase {

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
        def b = new BioMarker(name: testData)
        b.save()

        def t = new BioMarker(name: testData)
        assertEquals testData, b.name
    }
}

