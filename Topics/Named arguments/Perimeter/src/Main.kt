import kotlin.math.pow
import kotlin.math.sqrt

data class Point(var x: Double, var y: Double)

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double {
    val a = Point(x1, y1)
    val b = Point(x2, y2)
    val c = Point(x3, y3)
    return distance(a, b) + distance(b, c) + distance(c, a)
}

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double,
              x4: Double, y4: Double): Double {
    val a = Point(x1, y1)
    val b = Point(x2, y2)
    val c = Point(x3, y3)
    val d = Point(x4, y4)
    return distance(a, b) + distance(b, c) + distance(c, d) + distance(d, a)
}

fun distance(a: Point, b: Point): Double {
    return sqrt((b.x - a.x).pow(2) + (b.y - a.y).pow(2))
}