fun main() {
    val (a, b) = List(2) { readLine()!!.toInt() }
    if (b == 0) println("Division by zero, please fix the second argument!") else println(a / b)
}