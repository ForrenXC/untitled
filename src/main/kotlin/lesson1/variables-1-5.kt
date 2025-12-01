fun main() {
    val secondsInSpace: Int = 6480

    val hours: Int = secondsInSpace / 3600
    val minute: Int = secondsInSpace / 60 % 60
    val second: Int = secondsInSpace % 60

    println(String.format("%02d:%02d:%02d", hours, minute, second))
}