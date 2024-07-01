abstract class CurvedShape(origin: Point) : Shape(origin) {
    abstract fun getAttributes(): Point
    abstract override fun getArea(): Double
}