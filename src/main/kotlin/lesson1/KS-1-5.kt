const val HOUR = 3600
const val MINUTE = 60

fun main() {
    val secondsInSpace: Int = 6480


    val hours: Int = secondsInSpace / HOUR
    val minutes: Int = secondsInSpace / MINUTE % MINUTE
    val seconds: Int = secondsInSpace % MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}