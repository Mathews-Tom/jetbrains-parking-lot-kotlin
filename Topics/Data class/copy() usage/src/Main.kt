// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    val (h, l1, l2, w) = List(4) { readLine()!!.toInt() }
    val box1 = Box(h, l1, w)
    val box2 = box1.copy(length = l2)
    println(box1)
    println(box2)
}