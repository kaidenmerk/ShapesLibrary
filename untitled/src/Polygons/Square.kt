class Square(origin: Point, width: Double) : Polygon(origin, width, width) {
    init {
        require(width > 0) { "A square cannot have 0 width" }
    }
    override fun getArea(): Double {
        return this.width * this.length
    }

}