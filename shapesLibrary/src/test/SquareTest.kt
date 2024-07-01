import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import Polygons.Square

class SquareTest {

    @Test
    fun testGetArea() {
        val origin = Point(0.0, 0.0)
        val square = Square(origin, 2.0)
        assertEquals(4.0, square.getArea())
    }

    @Test
    fun testMove() {
        val origin = Point(0.0, 0.0)
        val square = Square(origin, 2.0)
        square.moveShape(1.0, 1.0)
        val attributes = square.getAttributes()
        assertEquals(1.0, attributes[0].getX())
        assertEquals(1.0, attributes[0].getY())
    }
}
