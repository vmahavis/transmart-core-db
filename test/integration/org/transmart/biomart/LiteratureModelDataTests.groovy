package org.transmart.biomart

import static org.junit.Assert.*
import org.junit.*

class LiteratureModelDataTests extends GroovyTestCase {

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
        def b = new LiteratureModelData(modelType: testData)
        b.save()

        def t = new LiteratureModelData(modelType: testData)
        assertEquals testData, b.modelType
    }
}
