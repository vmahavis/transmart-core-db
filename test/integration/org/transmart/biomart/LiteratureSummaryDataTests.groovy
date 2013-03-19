package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureSummaryDataTests extends GroovyTestCase {

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
        def b = new LiteratureSummaryData(diseaseSite: testData)
        b.save()

        def t = new LiteratureSummaryData(diseaseSite: testData)
        assertEquals testData, b.diseaseSite
    }
}
