package test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import Point
import Circle
class CircleTest {

    @Test
    fun testGetArea() {
        val origin = Point(0.0, 0.0)
        val circle = Circle(origin, 2.0)
        assertEquals(3.14159 * 2.0 * 2.0, circle.getArea())
    }

    @Test
    fun testMove() {
        val origin = Point(0.0, 0.0)
        val circle = Circle(origin, 2.0)
        circle.moveShape(1.0, 1.0)
        val attributes = circle.getAttributes()
        assertEquals(1.0, attributes.getX())
        assertEquals(1.0, attributes.getY())
    }
}
