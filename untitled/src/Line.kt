import kotlin.math.sqrt

class Line(private var point1: Point, private var point2: Point) {

    // Initializes line if point1 != point2
    init {
        require(point1 != point2) { "A line cannot have 0 length" }
    }

    // Return cloned points so that they can be grabbed without changing member variables.
    fun getPoint1(): Point {
        return point1.clone()
    }

    fun getPoint2(): Point {
        return point2.clone()
    }

    fun getSlope(): Double {
        val deltaX = point2.getX() - point1.getX()
        val deltaY = point2.getY() - point1.getY()
        return deltaY / deltaX
    }

    fun getLength(): Double {
        val deltaX = point2.getX() - point1.getX()
        val deltaY = point2.getY() - point1.getY()
        return sqrt(deltaX * deltaX + deltaY * deltaY)
    }

    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
}
