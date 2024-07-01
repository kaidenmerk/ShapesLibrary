package test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import Point
import Line
class LineTest {

    @Test
    fun testGetPoint1() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(1.0, 1.0)
        val line = Line(point1, point2)
        val point1Clone = line.getPoint1()
        assertEquals(point1.getX(), point1Clone.getX())
        assertEquals(point1.getY(), point1Clone.getY())
    }

    @Test
    fun testGetPoint2() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(1.0, 1.0)
        val line = Line(point1, point2)
        val point2Clone = line.getPoint2()
        assertEquals(point2.getX(), point2Clone.getX())
        assertEquals(point2.getY(), point2Clone.getY())
    }

    @Test
    fun testGetSlope() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(1.0, 1.0)
        val line = Line(point1, point2)
        assertEquals(1.0, line.getSlope())
    }

    @Test
    fun testGetLength() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(3.0, 4.0)
        val line = Line(point1, point2)
        assertEquals(5.0, line.getLength())
    }

    @Test
    fun testMove() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(1.0, 1.0)
        val line = Line(point1, point2)
        line.move(2.0, 3.0)
        assertEquals(2.0, line.getPoint1().getX())
        assertEquals(3.0, line.getPoint1().getY())
        assertEquals(3.0, line.getPoint2().getX())
        assertEquals(4.0, line.getPoint2().getY())
    }
}
