fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = if (rooms <= 1) {
        Cabin(rooms, price)
    } else if (rooms <= 3) {
        Bungalow(rooms, price)
    } else if (rooms <= 4) {
        Cottage(rooms, price)
    } else if (rooms <= 7) {
        Mansion(rooms, price)
    } else {
        Palace(rooms, price)
    }
    println(house.totalPrice())
}

open class House(val rooms: Int, var price: Int, private val coefficient: Double) {
    init {
        price = if (price < 0) 0 else if (price > 1_000_000) 1_000_000 else price
    }
    fun totalPrice() = (price * coefficient).toInt()re
}

class Cabin(rooms: Int,price: Int) : House(rooms, price, 1.0)

class Bungalow(rooms: Int,price: Int) : House(rooms, price, 1.2)

class Cottage(rooms: Int,price: Int) : House(rooms, price, 1.25)

class Mansion(rooms: Int,price: Int) : House(rooms, price, 1.4)

class Palace(rooms: Int,price: Int) : House(rooms, price, 1.6)
