import kotlin.math.pow

fun main() {
    val paramName = readLine()!!
    val paramValue = readLine()!!.toInt()
    when (paramName) {
        "amount" -> println(calculateCompoundInterest(amount = paramValue))
        "percent" -> println(calculateCompoundInterest(percent = paramValue))
        "years" -> println(calculateCompoundInterest(years = paramValue))
        else -> println("Invalid parameter")
    }
}

fun calculateCompoundInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10): Int {
    return (amount * (1 + percent / 100.0).pow(years)).toInt()
}