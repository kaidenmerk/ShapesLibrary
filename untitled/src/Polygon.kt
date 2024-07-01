abstract class Polygon(override var origin: Point, var width: Double, var length: Double) : Shape(origin) {
    init {
        require(length > 0) { println("A polygon cannot have 0 length") }
        require(width > 0) { println("A polygon cannot have 0 width") }
    }

    abstract fun getAttributes(): List<Point>
    abstract override fun getArea(): Double

}