package uk.co.thirstybear.aoc24.day1


fun string2list(input: List<String>): Pair<List<Int>, List<Int>> {
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    input.forEach { string ->
        val (i1, i2) = string.split("   ")
        list1.add(i1.toInt())
        list2.add(i2.toInt())
    }

    return Pair(list1.toList(), list2.toList())
}