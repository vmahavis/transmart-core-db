package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class ContentRepositoryTests extends GroovyTestCase {

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
        def b = new ContentRepository(location: testData)
        b.save()

        def t = new ContentRepository(location: testData)
        assertEquals testData, b.location
    }
}

