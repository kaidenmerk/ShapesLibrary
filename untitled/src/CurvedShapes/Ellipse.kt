open class Ellipse(origin: Point, var radius1: Double, var radius2: Double) : CurvedShape(origin) {
    init {
        require(radius1 > 0) { println("A curved shape cannot have area 0") }
        require(radius2 > 0) { println("A curved shape cannot have area 0") }
    }
    override fun getAttributes(): Point {
        println("Origin at (${origin.getX()}, ${origin.getY()})")
        return origin.clone()
    }

    override fun getArea(): Double {
        return 3.14159 * radius1 * radius2
    }

}