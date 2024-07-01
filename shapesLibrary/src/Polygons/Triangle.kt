package Polygons
import Point
import Polygon
class Triangle(origin: Point, width: Double, length: Double) : Polygon(origin, width, length) {
    override fun getAttributes(): List<Point> {
        var point2 = Point(origin.getX(), origin.getY() + this.length)
        var point3 = Point(origin.getX() +this.width, origin.getY())
        println("Point 1 at ${origin.printPoint()}")
        println("Point 2 at ${point2.printPoint()}")
        println("Point 3 at ${point3.printPoint()}")
        return listOf(origin, point2, point3)
    }

    override fun getArea(): Double {
        return this.width * this.length * 0.5
    }

}