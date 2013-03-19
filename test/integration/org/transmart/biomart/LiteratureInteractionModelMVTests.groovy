package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureInteractionModelMVTests extends GroovyTestCase {

    private def testData = "TEST MODEL"
    @Before
    void setUp() {

    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testData() {
        def b = new LiteratureInteractionModelMV(experimentalModel: testData)
        b.save()

        def t = new LiteratureInteractionModelMV(experimentalModel: testData)
        assertEquals testData, b.experimentalModel
    }
}
