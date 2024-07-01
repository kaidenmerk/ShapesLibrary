open class Ellipse(origin: Point, var radius1: Double, var radius2: Double) : CurvedShape(origin) {
    override fun getAttributes(): Point {
        println("Origin at (${origin.getX()}, ${origin.getY()})")
        return origin.clone()
    }

    override fun getArea(): Double {
        return 3.14159 * radius1 * radius2
    }

}