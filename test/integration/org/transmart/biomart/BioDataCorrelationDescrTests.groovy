package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioDataCorrelationDescrTests {

    private def testData = "TRUE"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new BioDataCorrelationDescr(status: testData)
        b.save()

        def t = new BioDataCorrelationDescr(status: testData)
        assertEquals testData, b.status
    }
}
