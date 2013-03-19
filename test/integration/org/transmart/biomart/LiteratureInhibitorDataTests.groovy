package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureInhibitorDataTests extends GroovyTestCase {

    private def testData  = "TEST"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new LiteratureInhibitorData(effectResponseRate: testData)
        b.save()

        def t = new LiteratureInhibitorData(effectResponseRate: testData)
        assertEquals testData, b.effectResponseRate

    }
}
