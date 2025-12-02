const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val secondsInSpace: Int = 6480

    val hours: Int = secondsInSpace / SECONDS_IN_HOUR
    val minutes: Int = secondsInSpace / SECONDS_IN_MINUTE % SECONDS_IN_MINUTE
    val seconds: Int = secondsInSpace % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}