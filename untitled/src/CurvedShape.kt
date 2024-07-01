abstract class CurvedShape(origin: Point) : Shape(origin) {
    abstract fun getAttributes(): String
    abstract override fun getArea(): Double
}