package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class ClinicalTrialTimePointTests extends GroovyTestCase {

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
        def b = new ClinicalTrialTimePoint(timePoint: testData)
        b.save()

        def t = new ClinicalTrialTimePoint(timePoint: testData)
        assertEquals testData, b.timePoint

    }
}
