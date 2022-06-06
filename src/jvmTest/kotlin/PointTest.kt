//import org.junit.jupiter.api.Test
//
//import org.junit.jupiter.api.Assertions.*
//
//internal class PointTest {
//
//    @Test
//    fun getX() {
//        var point = Point(0.toDouble(), 0.toDouble())
//
//        assertEquals(0.toDouble(), point.x)
//    }
//
//    @Test
//    fun setX() {
//        var point = Point(0.toDouble(), 0.toDouble())
//
//        point.x = 1.toDouble()
//
//        assertEquals(1.toDouble(), point.x)
//    }
//
//    @Test
//    fun getY() {
//        var point = Point(0.toDouble(), 0.toDouble())
//
//        assertEquals(0.toDouble(), point.y)
//    }
//
//    @Test
//    fun setY() {
//        var point = Point(0.toDouble(), 0.toDouble())
//
//        point.y = 1.toDouble()
//
//        assertEquals(1.toDouble(), point.y)
//    }
//
//    @Test
//    fun clonePoint() {
//        var point = Point(0.toDouble(), 0.toDouble())
//
//        var pointClone = point.clonePoint()
//
//        assertEquals(point.x, pointClone.x)
//        assertEquals(point.y, pointClone.y)
//        assertNotEquals(point, pointClone)
//    }
//
//    @Test
//    fun movePointX() {
//        var point = Point(0.toDouble(), 0.toDouble())
//
//        point.movePointX(1)
//        point.movePointX(1)
//
//        assertEquals(2.toDouble(), point.x)
//    }
//
//    @Test
//    fun movePointY() {
//        var point = Point(0.toDouble(), 0.toDouble())
//
//        point.movePointY(1)
//        point.movePointY(1)
//
//        assertEquals(2.toDouble(), point.y)
//    }
//}