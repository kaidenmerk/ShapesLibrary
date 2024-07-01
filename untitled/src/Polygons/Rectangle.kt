class Rectangle(origin: Point, width: Double, length: Double) : Polygon(origin, width, length) {
    init {
        require(length > 0) { "A rectangle cannot have 0 length" }
        require(width > 0) { "A rectangle cannot have 0 width" }
    }
    override fun getArea(): Double {
        return this.width * this.length
    }

}