// Abstract because will have no implementation for a "Shape"
abstract class Shape(protected var origin: Point) {

    // Method to move the shape
    fun moveShape(deltaX: Double, deltaY: Double) {
        origin.move(deltaX, deltaY)
    }

    // Abstract method to get the attributes of the shape
    abstract fun getAttributes(): String

    // Abstract method to get the area of a shape
    abstract fun getArea(): Double
}