fun main() {
    val (str, subStr) = List(2) { readLine()!! }
    println(str.split(subStr).lastIndex)
}