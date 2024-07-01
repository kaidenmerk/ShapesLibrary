package test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import Polygons.Rectangle
import Point
class RectangleTest {

    @Test
    fun testGetArea() {
        val origin = Point(0.0, 0.0)
        val rectangle = Rectangle(origin, 2.0, 3.0)
        assertEquals(6.0, rectangle.getArea())
    }

    @Test
    fun testGetAttributes() {
        val origin = Point(0.0, 0.0)
        val rectangle = Rectangle(origin, 2.0, 3.0)
        val attributes = rectangle.getAttributes()
        assertEquals(4, attributes.size)
        assertEquals(0.0, attributes[0].getX())
        assertEquals(0.0, attributes[0].getY())
        assertEquals(0.0, attributes[1].getX())
        assertEquals(3.0, attributes[1].getY())
        assertEquals(2.0, attributes[2].getX())
        assertEquals(3.0, attributes[2].getY())
        assertEquals(2.0, attributes[3].getX())
        assertEquals(0.0, attributes[3].getY())
    }

    @Test
    fun testMove() {
        val origin = Point(0.0, 0.0)
        val rectangle = Rectangle(origin, 2.0, 3.0)
        rectangle.moveShape(1.0, 1.0)
        val attributes = rectangle.getAttributes()
        assertEquals(1.0, attributes[0].getX())
        assertEquals(1.0, attributes[0].getY())
    }
}
