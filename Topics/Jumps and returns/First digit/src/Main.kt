fun main() {
    val str = readLine()!!
    for (i in str.indices) {
        if (str[i].isDigit()) {
            println(str[i])
            break
        }
    }
}