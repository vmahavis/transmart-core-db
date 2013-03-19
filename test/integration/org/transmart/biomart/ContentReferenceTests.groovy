package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class ContentReferenceTests extends GroovyTestCase {

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
        def b = new ContentReference(bioDataId: testData)
        b.save()

        def t = new ContentReference(bioDataId: testData)
        assertEquals testData, b.bioDataId
    }
}