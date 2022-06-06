//import org.junit.jupiter.api.Test
//
//import org.junit.jupiter.api.Assertions.*
//import java.lang.RuntimeException
//
//internal class TriangleTest {
//
//    @Test
//    fun getArea() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(1.toDouble(), 1.toDouble()))
//        points.add(Point(0.toDouble(), 1.toDouble()))
//
//        var triangle = Triangle(points)
//
//        assertEquals(0.4999999999999998, triangle.getArea())
//
//    }
//
//    @Test
//    fun isValidTriangle() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(1.toDouble(), 1.toDouble()))
//        points.add(Point(0.toDouble(), 1.toDouble()))
//
//        org.junit.jupiter.api.assertDoesNotThrow<Triangle> {
//            makeTriangle(points)
//        }
//
//        var points2: MutableList<Point> = mutableListOf()
//        points2.add(Point(0.toDouble(), 0.toDouble()))
//        points2.add(Point(0.toDouble(), 0.toDouble()))
//        points2.add(Point(0.toDouble(), 0.toDouble()))
//
//        org.junit.jupiter.api.assertThrows<RuntimeException> {
//            makeTriangle(points2)
//        }
//
//        var points3: MutableList<Point> = mutableListOf()
//        points3.add(Point(0.toDouble(), 0.toDouble()))
//        points3.add(Point(0.toDouble(), 0.toDouble()))
//
//        org.junit.jupiter.api.assertThrows<RuntimeException> {
//            makeTriangle(points3)
//        }
//
//    }
//
//    private fun makeTriangle(points: MutableList<Point>): Triangle {
//        return Triangle(points)
//    }
//
//}