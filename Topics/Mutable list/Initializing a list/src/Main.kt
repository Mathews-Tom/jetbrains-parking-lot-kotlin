fun main() {
    val numbers = MutableList(100) {}.mapIndexed {
            idx, _ -> if (idx == 0 || idx == 9 || idx == 99) idx + 1 else 0
    }

    // do not touch the lines below 
    println(numbers.joinToString())
}