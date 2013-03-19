package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class BioSubjectTests extends GroovyTestCase {

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
        def b = new BioSubject(siteSubjectId: testData)
        b.save()

        def t = new BioSubject(siteSubjectId: testData)
        assertEquals testData, b.siteSubjectId
    }
}
