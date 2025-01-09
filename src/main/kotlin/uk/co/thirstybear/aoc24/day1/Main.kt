package uk.co.thirstybear.aoc24.day1

import java.io.File


fun main() {
    val(list1, list2) = string2list(File("day1_data.txt").readLines())

    val distance = calculate(list1, list2)

    println("Distance: $distance")
}


