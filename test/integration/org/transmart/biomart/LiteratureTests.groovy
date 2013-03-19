package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureTests extends GroovyTestCase {

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
        def b = new Literature(statement: testData)
        b.save()

        def t = new Literature(statement: testData)
        assertEquals testData, b.statement
    }
}
