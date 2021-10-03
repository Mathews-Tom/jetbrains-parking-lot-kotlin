fun main() {
    val str = readLine()!!
    println("" + str.last() + str.substring(1, str.lastIndex) + str.first())
}