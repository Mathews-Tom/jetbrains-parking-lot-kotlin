fun main() {
    val listSize = readLine()!!.toInt()
    val myList: MutableList<Int> = mutableListOf()
    for (i in 0 until listSize) myList += readLine()!!.toInt()
    val (p, m) = readLine()!!.split(' ').map(String::toInt)
    println(if (p in myList && m in myList) "YES" else "NO")
}