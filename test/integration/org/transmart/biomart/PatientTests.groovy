package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class PatientTests extends GroovyTestCase {

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
        def b = new Patient(firstName: "John")
        b.save()

        def t = new Patient(firstName: "John")
        assertEquals "John", b.firstName
    }
}
