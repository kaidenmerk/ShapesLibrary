var x : Double = 0.0
var y : Double = 0.0
var point : Point = Point(x, y)
var rectangle = Rectangle(point, 10.0, 8.0)
fun main() {
rectangle.getAttributes()
println(rectangle.getArea())
}
