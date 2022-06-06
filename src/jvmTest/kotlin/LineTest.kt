//import org.junit.jupiter.api.Test
//
//import org.junit.jupiter.api.Assertions.*
//import java.lang.RuntimeException
//
//internal class LineTest {
//
//    @Test
//    fun getSlope() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(1.toDouble(), 0.toDouble()))
//
//        var line = Line(points)
//
//        assertEquals(0.toDouble(), line.getSlope())
//    }
//
//    @Test
//    fun getLength() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(1.toDouble(), 0.toDouble()))
//
//        var line = Line(points)
//
//        println(line.getLength())
//        assertEquals(1.toDouble(), line.getLength())
//    }
//
//    @Test
//    fun checkLength() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(1.toDouble(), 0.toDouble()))
//
//        org.junit.jupiter.api.assertDoesNotThrow<Line> {
//            makeLine(points)
//        }
//
//        var points2: MutableList<Point> = mutableListOf()
//        points2.add(Point(0.toDouble(), 0.toDouble()))
//        points2.add(Point(0.toDouble(), 0.toDouble()))
//
//        org.junit.jupiter.api.assertThrows<RuntimeException> {
//            makeLine(points2)
//        }
//
//        var points3: MutableList<Point> = mutableListOf()
//        points3.add(Point(0.toDouble(), 0.toDouble()))
//
//        org.junit.jupiter.api.assertThrows<RuntimeException> {
//            makeLine(points3)
//        }
//    }
//
//
//    private fun makeLine(points: MutableList<Point>): Line {
//        return Line(points)
//    }
//}