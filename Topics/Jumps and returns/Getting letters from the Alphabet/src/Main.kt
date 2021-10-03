fun main() {
    val finalLetter = readLine()!!.toCharArray()[0]
    var letter = 'a'
    do {
        print(letter)
        letter++
    } while (letter != finalLetter)
}