import Polygons.Rectangle

var x : Double = 3.0
var y : Double = 12.0
var point : Point = Point(x, y)
var tri = Triangle(point, 10.0, 8.0)
var rectangle = Rectangle(point, 10.0, 8.0)
var sq = Square(point, x)
fun main() {
    tri.getAttributes()
    rectangle.getAttributes()
    println(rectangle.getArea())
    println(tri.getArea())
}
