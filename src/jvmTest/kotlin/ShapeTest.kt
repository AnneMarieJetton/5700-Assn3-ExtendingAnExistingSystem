//import org.junit.jupiter.api.Assertions.*
//import org.junit.jupiter.api.Test
//
//internal class ShapeTest {
//
//    @Test
//    fun getPoints() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(1.toDouble(), 2.toDouble()))
//
//        var rectangle = Rectangle(points)
//
//        assertEquals(points, rectangle.points)
//    }
//
//    @Test
//    fun setPoints() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(1.toDouble(), 2.toDouble()))
//
//        var rectangle = Rectangle(points)
//
//        var points2: MutableList<Point> = mutableListOf()
//        points2.add(Point(0.toDouble(), 0.toDouble()))
//        points2.add(Point(1.toDouble(), 4.toDouble()))
//
//        rectangle.points = points2
//
//        assertEquals(points2, rectangle.points)
//    }
//
//    @Test
//    fun moveShape() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(1.toDouble(), 2.toDouble()))
//
//        var rectangle = Rectangle(points)
//
//        rectangle.moveShape(1,1)
//
//        assertEquals(1.toDouble(), rectangle.points[0].x)
//        assertEquals(1.toDouble(), rectangle.points[0].y)
//        assertEquals(2.toDouble(), rectangle.points[1].x)
//        assertEquals(3.toDouble(), rectangle.points[1].y)
//    }
//}