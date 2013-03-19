package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class PatientEventAttributeTests extends GroovyTestCase {

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
        def b = new PatientEventAttribute(bioPatientAttrCode: testData)
        b.save()

        def t = new PatientEventAttribute(bioPatientAttrCode: testData)
        assertEquals testData, b.bioPatientAttrCode
    }
}