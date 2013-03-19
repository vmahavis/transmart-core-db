package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class ClinicalTrialTests extends GroovyTestCase {

    private def testData  = "GSE1000"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new ClinicalTrial(trialNumber: testData)
        b.save()

        def t = new ClinicalTrial(trialNumber: testData)
        assertEquals testData, b.trialNumber

    }
}
