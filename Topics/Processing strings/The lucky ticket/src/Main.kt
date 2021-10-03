fun main() {
    val ticketNoInts = readLine()!!.toList().map { it.digitToInt() }
    val lastIdx = ticketNoInts.lastIndex
    if (ticketNoInts[0] + ticketNoInts[1] + ticketNoInts[2] ==
        ticketNoInts[lastIdx] + ticketNoInts[lastIdx - 1] + ticketNoInts[lastIdx - 2]) {
        println("Lucky")
    } else {
        println("Regular")
    }
}
