fun main() {
    var number = readLine()!!.toInt()
    while (number != 1) {
        print("$number ")
        number = if (number % 2 == 0) even(number) else odd(number)
    }
    print("$number")
}

fun even(x: Int) = x / 2

fun odd(x: Int) = x * 3 + 1