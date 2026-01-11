package org.example.lesson2

fun  main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5

    val averageScoreStudent  = (student1 + student2 + student3 + student4) / 4f
    println("%.2f".format(averageScoreStudent))
}
