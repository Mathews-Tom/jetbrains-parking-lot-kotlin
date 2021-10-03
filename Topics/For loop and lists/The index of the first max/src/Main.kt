fun main() {
    val listSize = readLine()!!.toInt()
    val myList: MutableList<Int> = mutableListOf()
    for (i in 0 until listSize) myList += readLine()!!.toInt()
    print(myList.indexOf(myList.maxOrNull()))
}