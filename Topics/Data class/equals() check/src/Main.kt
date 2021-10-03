data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        other as Client
        return name == other.name && age == other.age
    }
}

operator fun <T> List<T>.component6(): T = get(5)

fun main() {
    val (name1, age1, balance1, name2, age2, balance2) = List(6) { readLine()!! }
    val client1 = Client(name1, age1.toInt(), balance1.toInt())
    val client2 = Client(name2, age2.toInt(), balance2.toInt())
    println(client1 == client2)
}
