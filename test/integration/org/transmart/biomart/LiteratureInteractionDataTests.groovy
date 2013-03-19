package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureInteractionDataTests extends GroovyTestCase {

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
        def b = new LiteratureInteractionData(sourceComponent: testData)
        b.save()

        def t = new LiteratureInteractionData(sourceComponent: testData)
        assertEquals testData, b.sourceComponent

    }
}
