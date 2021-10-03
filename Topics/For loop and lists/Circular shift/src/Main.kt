import java.util.*

fun main() {
    val myList: MutableList<Int> = mutableListOf()
    for (i in 0 until readLine()!!.toInt()) myList.add(readLine()!!.toInt())
    Collections.rotate(myList, +1)
    println(myList.joinToString(" "))
}