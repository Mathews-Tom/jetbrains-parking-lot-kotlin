fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = when (productType) {
        "headphones" -> Headphones(price)
        "smartphone" -> Smartphone(price)
        "tv" -> Tv(price)
        "laptop" -> Laptop(price)
        else -> Product(price)
    }
    println(totalPrice(product))
}
fun totalPrice(product: Product) = product.price + product.price * product.productTax / 100

open class Product(val price: Int, val productTax: Int = 0)

class Headphones(price: Int) : Product(price, productTax = 11)

class Smartphone(price: Int) : Product(price, productTax = 15)

class Tv(price: Int) : Product(price, productTax = 17)

class Laptop(price: Int) : Product(price, productTax = 19)