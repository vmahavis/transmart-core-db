package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioAssayDataAnnotationTests extends GroovyTestCase {

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
        def b = new BioAssayDataAnnotation(bioMarker: testData)
        b.save()

        def t = new BioAssayDataAnnotation(bioMarker: testData)
        assertEquals testData, b.bioMarker

    }
}
