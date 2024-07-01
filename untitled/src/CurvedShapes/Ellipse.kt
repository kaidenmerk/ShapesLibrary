open class Ellipse(origin: Point, override var radius1: Double, override var radius2: Double) : CurvedShape(origin, radius1, radius2) {

    override fun getAttributes(): Point {
        println("Origin at (${origin.getX()}, ${origin.getY()})")
        return origin.clone()
    }


}