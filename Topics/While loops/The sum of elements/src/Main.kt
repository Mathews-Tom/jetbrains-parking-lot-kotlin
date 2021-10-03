fun main() {
    var sum = 0
    do {
        val inp = readLine()!!.toInt()
        sum += inp
    } while (inp != 0)
    println(sum)
}