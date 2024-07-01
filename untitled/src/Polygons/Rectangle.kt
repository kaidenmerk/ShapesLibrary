class Rectangle(origin: Point, width: Double, length: Double) : Polygon(origin, width, length) {
    override fun getArea(): Double {
        return this.width * this.length
    }

}