package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class ClinicalTrialPatientGroupTests extends GroovyTestCase {

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
        def b = new ClinicalTrialPatientGroup(name: testData)
        b.save()

        def t = new ClinicalTrialPatientGroup(name: testData)
        assertEquals testData, b.name

    }
}
