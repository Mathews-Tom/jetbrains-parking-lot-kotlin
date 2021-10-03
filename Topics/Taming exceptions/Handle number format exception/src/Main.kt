fun parseCardNumber(cardNumber: String): Long {
    val cardParts = cardNumber.split(" ")
    val predicate: (String) -> Boolean = { it.length == 4 && it.toIntOrNull() is Int }
    if (cardParts.size == 4 && cardParts.all(predicate)) {
        return cardNumber.replace(" ", "").toLong()
    } else {
        throw Exception("Invalid Credit Card number")
    }
}