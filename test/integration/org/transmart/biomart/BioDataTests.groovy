package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioDataTests extends GroovyTestCase {

    private def testData = "10000"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new BioData(uniqueId: testData)
        b.save()

        def t = new BioData(uniqueId: testData)
        assertEquals testData, b.uniqueId
    }
}

