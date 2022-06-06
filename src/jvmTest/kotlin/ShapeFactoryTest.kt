//import org.junit.jupiter.api.Test
//
//import org.junit.jupiter.api.Assertions.*
//
//internal class RectangleTest {
//
//    @Test
//    fun makeShapes() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(2.toDouble(), 2.toDouble()))
//
//        var square = Square(points)
//
//        var info = "Square,Rectangle,0,0,2,2,4,4,5,5"
//
//        var shapes = shapeFactory.makeShapes(info)
//
//        assertEquals(square.points, shapes[1].points)
//        assertEquals(square.area, shapes[1].area)
//    }
//
//}