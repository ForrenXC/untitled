package org.example.lesson2

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buff = 20

    val crystallineOreBuff = (crystallineOre * buff) / 100
    val ironOreBuff = (ironOre * buff) / 100

    println(crystallineOreBuff)
    println(ironOreBuff)
}