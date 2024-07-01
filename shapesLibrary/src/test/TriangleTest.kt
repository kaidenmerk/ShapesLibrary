import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import Polygons.Triangle
class TriangleTest {

    @Test
    fun testGetArea() {
        val origin = Point(0.0, 0.0)
        val triangle = Triangle(origin, 2.0, 3.0)
        assertEquals(3.0, triangle.getArea())
    }

    @Test
    fun testMove() {
        val origin = Point(0.0, 0.0)
        val triangle = Triangle(origin, 2.0, 3.0)
        triangle.moveShape(1.0, 1.0)
        val attributes = triangle.getAttributes()
        assertEquals(1.0, attributes[0].getX())
        assertEquals(1.0, attributes[0].getY())
    }
}
