package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureProteinEffectDataTests extends GroovyTestCase {

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
        def b = new LiteratureProteinEffectData(description: testData)
        b.save()

        def t = new LiteratureProteinEffectData(description: testData)
        assertEquals testData, b.description

    }
}
