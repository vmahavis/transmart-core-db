package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureReferenceDataTests extends GroovyTestCase {

    private def testData = "1001"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new LiteratureReferenceData(geneId: testData)
        b.save()

        def t = new LiteratureReferenceData(geneId: testData)
        assertEquals testData, b.geneId
    }
}
