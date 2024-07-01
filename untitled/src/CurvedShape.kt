abstract class CurvedShape(origin: Point) : Shape(origin) {
    abstract override fun getAttributes(): String
    abstract override fun getArea(): Double
}