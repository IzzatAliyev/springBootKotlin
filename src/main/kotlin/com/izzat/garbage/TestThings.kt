package com.izzat.garbage

var numbers = mutableListOf(2, 3, 4, 5, 12, 23, 53)

fun Nullable(): Unit {
    var a: Int? = null
    val b: Any? = null

    println(a)
    println(b)
}

fun addNumber(num1: Int): List<Int> {
    numbers.add(num1)
    println("Added new elem $num1")
    println(numbers)
    return numbers
}

fun removeByIndex(index: Int): List<Int> {
    println("Removed ${numbers[index]}")
    numbers.removeAt(index)
    println(numbers)
    return numbers
}

fun addNumber2(num: Int) = numbers.add(num)

/**
 * Add a num to another number
 *
 * @property num the num to add
 * @return sum of two numbers
 */
infix fun Int.add(num: Int): Int {
    return this + num
}

fun sum(vararg numbers: Int): Int {
    println(numbers)
    return numbers.sum();
}