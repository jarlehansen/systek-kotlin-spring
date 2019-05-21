package no.systek.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ServiceTest {

    @Test
    fun `Hello world`() {
        val helloWorld = Service().helloWorld()
        assertEquals("Hello World", helloWorld)
    }
}