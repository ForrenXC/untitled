fun main() {
    val secondsInSpace: Int = 6480
    val HOUR = 3600
    val MINUTE = 60

    val hours: Int = secondsInSpace / HOUR
    val minutes: Int = secondsInSpace / MINUTE % MINUTE
    val seconds: Int = secondsInSpace % MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}