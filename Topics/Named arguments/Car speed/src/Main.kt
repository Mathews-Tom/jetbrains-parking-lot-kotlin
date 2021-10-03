fun main(args: Array<String>) {
    val (speed, limit) = List(2) { readLine()!! }
    val (check, speedDiff) = speedCheck(speed = speed, limit = limit)
    println(if (check) "Exceeds the limit by $speedDiff kilometers per hour" else "Within the limit")
}

fun speedCheck(speed: String, limit: String = "60"): Pair<Boolean, Int> {
    val speedInt = speed.toInt()
    var limitInt = 0
    limitInt = if (limit == "no limit") 60 else limit.toInt()
    return Pair(speedInt > limitInt, speedInt - limitInt)
}