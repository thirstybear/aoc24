package uk.co.thirstybear.aoc24.day1


fun main() {
    val list1 = arrayOf(3, 4, 2, 1, 3, 3)
    val list2 = arrayOf(4, 3, 5, 3, 9, 3)

    val distance = calculate(list1, list2)

    println("Distance: $distance")
}


