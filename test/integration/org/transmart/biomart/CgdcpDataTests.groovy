package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class CgdcpDataTests extends GroovyTestCase {

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
        def b = new CgdcpData(evidenceCode: testData)
        b.save()

        def t = new CgdcpData(evidenceCode: testData)
        assertEquals testData, b.evidenceCode

    }
}
