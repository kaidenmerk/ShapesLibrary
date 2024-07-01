import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PointTest {

    @Test
    fun testGetX() {
        val point = Point(3.0, 4.0)
        assertEquals(3.0, point.getX())
    }

    @Test
    fun testGetY() {
        val point = Point(3.0, 4.0)
        assertEquals(4.0, point.getY())
    }

    @Test
    fun testClone() {
        val point = Point(3.0, 4.0)
        val clone = point.clone()
        assertEquals(3.0, clone.getX())
        assertEquals(4.0, clone.getY())
        assertNotSame(point, clone)
    }

    @Test
    fun testMove() {
        val point = Point(3.0, 4.0)
        point.move(1.0, 2.0)
        assertEquals(4.0, point.getX())
        assertEquals(6.0, point.getY())
        println("wahahaha")
    }
}