fun main() {
    val size = readLine()!!.toInt()
    val mutList: MutableList<Int> = mutableListOf()
    var count = 0
    for (i in 0 until size) mutList += readLine()!!.toInt()
    for (i in 0 until size - 2) if (mutList[i] + 1 == mutList[i + 1] && mutList[i] + 2 == mutList[i + 2]) count++
    println(count)
}