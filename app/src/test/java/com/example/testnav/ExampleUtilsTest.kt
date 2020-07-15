package com.example.testnav

import org.junit.Test

import org.junit.Assert.*

class ExampleUtilsTest {
    @Test
    fun double_isCorrect() {
        assertEquals(ExampleUtils.square(4),16)
        assertEquals(ExampleUtils.square(-1),1)
    }
}
