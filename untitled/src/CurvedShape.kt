abstract class CurvedShape(origin: Point, radius1: Double, radius2: Double) : Shape(origin) {
    abstract val radius1: Double
    abstract val radius2: Double
    init {
        require(radius1 > 0) { println("A curved shape cannot have area 0") }
        require(radius2 > 0) { println("A curved shape cannot have area 0") }
    }
    abstract fun getAttributes(): Point
    override fun getArea(): Double {
        return 3.14159 * radius1 * radius2
    }
}