package uk.co.thirstybear.aoc24.day1

import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ListReaderTest {
    @Test
    fun `Reads list of strings into two lists`() {
        val input = listOf("1   2", "3   4", "5   6")

        val (list1, list2) = string2list(input)

        assertTrue(listOf(1, 3, 5) == list1)
        assertTrue(listOf(2, 4, 6) == list2)
    }

    @Test
    fun `Can read day 1 test data file`() {
        val(list1, list2) = string2list(File("day1_data.txt").readLines())

        assertEquals(1000, list1.size)
        assertEquals(1000, list2.size)
    }
}