abstract class Polygon(origin: Point, width: Double, length: Double) : Shape(origin) {
    abstract override fun getAttributes(): String
    abstract override fun getArea(): Double

}