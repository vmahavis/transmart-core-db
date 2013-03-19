package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class PatientEventTests extends GroovyTestCase {

    private def testData = "OTHER"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new PatientEvent(eventCode: testData)
        b.save()

        def t = new PatientEvent(eventCode: testData)
        assertEquals testData, b.eventCode
    }
}