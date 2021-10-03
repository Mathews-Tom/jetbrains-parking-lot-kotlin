fun main() {
    var count = 0
    do {
        val inp = readLine()!!.toInt()
        count++
    } while (inp != 0)
    println(count - 1)
}