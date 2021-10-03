fun main(args: Array<String>) {
    val paramName = readLine()!!
    val paramValue = readLine()!!.toInt()
    println(when (paramName) {
        "old" -> calculateSecondHandMarketPrice(years = paramValue)
        "passed" -> calculateSecondHandMarketPrice(mileage = paramValue)
        "speed" -> calculateSecondHandMarketPrice(maxSpeed = paramValue)
        "auto" -> calculateSecondHandMarketPrice(automaticTransmission = paramValue == 1)
        else -> "Invalid parameter"
    })
}

fun calculateSecondHandMarketPrice(
    years: Int = 5,
    mileage: Int = 100_000,
    maxSpeed: Int = 120,
    automaticTransmission: Boolean = false,
    initialPrice: Int = 20_000
): Int {
    val yearsDiff = years * -2000
    val mileageDiff = mileage / 10_000 * -200
    val maxSpeedDiff = (maxSpeed - 120) * 100
    val transmissionDiff = if (automaticTransmission) 1500 else 0
    return initialPrice + yearsDiff + mileageDiff + maxSpeedDiff + transmissionDiff
}