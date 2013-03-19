package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureAlterationDataTests extends GroovyTestCase {

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
        def b = new LiteratureAlterationData(control: testData)
        b.save()

        def t = new LiteratureAlterationData(control: testData)
        assertEquals testData, b.control

    }
}
