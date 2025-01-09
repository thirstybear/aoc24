package uk.co.thirstybear.aoc24.day1

import kotlin.math.abs

fun calculate(list1: List<Int>, list2: List<Int>): Int {
    val pairs = list1.sorted().zip(list2.sorted())

    val distance = pairs.fold(0) { acc, pair ->
        acc + abs(pair.first - pair.second)
    }
    return distance
}