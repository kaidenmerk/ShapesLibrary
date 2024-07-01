package Polygons
import Point
import Polygon

// By making rectangle class open I can inherit from Rectangle in my square class
open class Rectangle(origin: Point, width: Double, length: Double) : Polygon(origin, width, length) {

    override fun getArea(): Double {
        return this.width * this.length
    }

}