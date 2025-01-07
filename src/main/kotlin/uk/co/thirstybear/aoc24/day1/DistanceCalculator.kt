package uk.co.thirstybear.aoc24.day1

import kotlin.math.abs

fun calculate(list1: Array<Int>, list2: Array<Int>): Int {
    val pairs = list1.distinct().sorted().zip(list2.distinct().sorted())

    val distance = pairs.fold(0) { acc, pair ->
        acc + abs(pair.first - pair.second)
    }
    return distance
}