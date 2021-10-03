fun main() {
    val (str1, str2) = List(2) { readLine()!! }
    println(str1.uppercase() == str2.uppercase())
}