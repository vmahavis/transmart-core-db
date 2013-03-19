package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class DiseaseTests extends GroovyTestCase {

    private def testData = "CANCER"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new Disease(disease: testData)
        b.save()

        def t = new Disease(disease: testData)
        assertEquals testData, b.disease
    }
}

