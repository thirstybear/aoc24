package uk.co.thirstybear.aoc24.day1

import kotlin.test.Test
import kotlin.test.assertEquals

class DistanceCalculatorTest {
    @Test
    fun `calculate distances`() {
        val list1 = arrayOf(3, 4, 2, 1, 3, 3)
        val list2 = arrayOf(4, 3, 5, 3, 9, 3)

        assertEquals(11, calculate(list1, list2))
    }
}