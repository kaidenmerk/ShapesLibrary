abstract class Polygon(override var origin: Point, var width: Double, var length: Double) : Shape(origin) {
    init {
        require(length > 0) { println("A polygon cannot have 0 length") }
        require(width > 0) { println("A polygon cannot have 0 width") }
    }
    fun getAttributes(): List<Point> {
        var point2 = Point(point.getX(), point.getY() + this.length)
        var point3 = Point(point.getX() +this.width, point.getY() + this.length)
        var point4 = Point(point.getX() +this.width, point.getY())
        println("Point 1 at ${point.printPoint()}")
        println("Point 2 at ${point2.printPoint()}")
        println("Point 3 at ${point3.printPoint()}")
        println("Point 4 at ${point4.printPoint()}")
        return listOf(point, point2, point3, point4)
    }
    abstract override fun getArea(): Double

}