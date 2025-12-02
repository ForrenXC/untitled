package org.example.lesson2

fun main() {
    val workers: Int = 50
    val workersSalary: Int = 30000

    val interns: Int = 30
    val internsSalary: Int = 20000

    val expensesPayWorkers = workers * workersSalary
    val totalExpenses = interns * internsSalary + expensesPayWorkers
    val averageExpenses = totalExpenses / (workers + interns)

    println(expensesPayWorkers)
    println(totalExpenses)
    println(averageExpenses)
}