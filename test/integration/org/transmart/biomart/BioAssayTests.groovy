package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioAssayTests extends GroovyTestCase {

    private def testData = "TEST_STUDY"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new BioAssay(study: testData)
        b.save()

        def t = new BioAssay(study: testData)
        assertEquals testData, b.study
    }
}

