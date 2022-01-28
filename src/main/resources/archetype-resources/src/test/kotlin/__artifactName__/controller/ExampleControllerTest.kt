package ${package}.${artifactName}.controller

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ExampleControllerTest {

    @Test
    fun healthCheck() {
        val exampleController = ExampleController()

        val healthCheck = exampleController.healthCheck()

        Assertions.assertEquals("ok", healthCheck)
    }
}