// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val xList = listOf("Fowler", "Beck", "Evans").toMutableList()
    val xSet = setOf("Fowler", "Beck", "Evans").toMutableSet()
    val xMap = mapOf(1 to "x", 2 to "y", -1 to "zz").toMutableMap()
    println("List:: ${xList.joinToString()}")
    println("Set:: ${xSet.joinToString()}")
    println("Map:: $xMap")
}
