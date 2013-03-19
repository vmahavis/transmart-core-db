package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class ContentTests extends GroovyTestCase {

    private def testData = "MICHIGAN"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new Content(location: testData)
        b.save()

        def t = new Content(location: testData)
        assertEquals testData, b.location
    }
}

