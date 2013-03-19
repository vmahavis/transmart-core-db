package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioDataCorrelationTests extends GroovyTestCase {

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
        def b = new BioDataCorrelation(bioDataId: testData)
        b.save()

        def t = new BioDataCorrelation(bioDataId: testData)
        assertEquals testData, b.bioDataId
    }
}

