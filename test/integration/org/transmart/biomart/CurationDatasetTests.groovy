package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class CurationDatasetTests extends GroovyTestCase {

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
        def b = new CurationDataset(creator: testData)
        b.save()

        def t = new CurationDataset(creator: testData)
        assertEquals testData, b.creator
    }
}

