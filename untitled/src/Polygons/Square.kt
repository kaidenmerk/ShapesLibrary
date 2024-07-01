import Polygons.Rectangle

class Square(origin: Point, width: Double) : Rectangle(origin, width, width) {
    init {
        require(width > 0) { println("A square cannot have 0 width") }
    }
}