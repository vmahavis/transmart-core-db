package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioDataAttributeTests extends GroovyTestCase {

    private def testData = "10000"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new BioDataAttribute(propertyCode: testData)
        b.save()

        def t = new BioDataAttribute(propertyCode: testData)
        assertEquals testData, b.propertyCode
    }
}

