fun main() {
    val year: Int = 1961

    var hours: Int = 9
    var minutes: Int = 7

    println(year)
    println("%02d".format(hours))
    println("%02d".format(minutes))

    hours = 10
    minutes = 55
    println("%02d:%02d".format(hours, minutes))
}