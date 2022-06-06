//import org.junit.jupiter.api.Test
//
//import org.junit.jupiter.api.Assertions.*
//
//internal class EllipseTest {
//
//    @Test
//    fun getRadii() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//
//        var radii: MutableList<Double> = mutableListOf()
//        radii.add(1.toDouble())
//        radii.add(2.toDouble())
//
//        var ellipse = Ellipse(points, radii)
//
//        assertEquals(radii, ellipse.radii)
//    }
//
//    @Test
//    fun setRadii() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//
//        var radii: MutableList<Double> = mutableListOf()
//        radii.add(1.toDouble())
//        radii.add(2.toDouble())
//
//        var radii2: MutableList<Double> = mutableListOf()
//        radii.add(1.toDouble())
//        radii.add(3.toDouble())
//
//        var ellipse = Ellipse(points, radii)
//
//        ellipse.radii = radii2
//        assertEquals(radii2, ellipse.radii)
//
//    }
//
//    @Test
//    fun getArea() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//
//        var radii: MutableList<Double> = mutableListOf()
//        radii.add(1.toDouble())
//        radii.add(2.toDouble())
//
//        var ellipse = Ellipse(points, radii)
//
//        assertEquals(6.283185307179586,ellipse.getArea())
//    }
//
//}