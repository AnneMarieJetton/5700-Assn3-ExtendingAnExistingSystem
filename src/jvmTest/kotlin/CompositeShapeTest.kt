//import org.junit.jupiter.api.Assertions.*
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.assertDoesNotThrow
//import org.junit.jupiter.api.assertThrows
//import java.lang.RuntimeException
//
//internal class CompositeShapeTest {
//
//    @Test
//    fun isValidCompositeShape() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//
//        var radii: MutableList<Double> = mutableListOf()
//        radii.add(1.toDouble())
//        radii.add(1.toDouble())
//
//        var circle: makeCircle(points, radii)
//        var ellipse: makeEllipse(points, radii)
//        var shapes: MutableList<Double> = {circle, ellipse}
//
//        assertDoesNotThrow<Circle> {
//            makeCompositeShape(points, radii)
//        }
//    }
//
//    private fun makeCircle(shapes: MutableList<Shape>, points: MutableList<Point>): Circle {
//        return CompositeShape(shapes, points)
//    }
//
//}