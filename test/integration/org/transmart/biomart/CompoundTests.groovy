package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class CompoundTests extends GroovyTestCase {

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
        def b = new Compound(codeName: testData)
        b.save()

        def t = new Compound(codeName: testData)
        assertEquals testData, b.codeName
    }
}

