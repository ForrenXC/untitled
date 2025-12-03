package org.example.lesson2

fun main() {
    val startDepartureHours = 9
    val startDepartureMinutes = 39
    val travelTime = 457

    val totalTime = startDepartureHours * 60 + startDepartureMinutes + travelTime

    val departureTimeHours = totalTime / 60 % 24
    val departureTimeMinutes = totalTime % 60

    println("%02d:%02d".format(departureTimeHours, departureTimeMinutes))
}
