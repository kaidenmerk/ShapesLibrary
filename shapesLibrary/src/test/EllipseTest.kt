package test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import Point
import Ellipse
class EllipseTest {

    @Test
    fun testGetArea() {
        val origin = Point(0.0, 0.0)
        val ellipse = Ellipse(origin, 2.0, 3.0)
        assertEquals(3.14159 * 2.0 * 3.0, ellipse.getArea())
    }

    @Test
    fun testMove() {
        val origin = Point(0.0, 0.0)
        val ellipse = Ellipse(origin, 2.0, 3.0)
        ellipse.moveShape(1.0, 1.0)
        val attributes = ellipse.getAttributes()
        assertEquals(1.0, attributes.getX())
        assertEquals(1.0, attributes.getY())
    }
}
