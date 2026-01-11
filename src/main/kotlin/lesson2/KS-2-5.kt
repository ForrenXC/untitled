package org.example.lesson2

import kotlin.math.pow

fun main() {
    val deposit = 70_000
    val interestRate = 16.7 / 100

    val result = deposit * (1 + interestRate).pow(20)

    println("%.3f".format(result))
}