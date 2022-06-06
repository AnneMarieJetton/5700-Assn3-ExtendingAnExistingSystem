//import org.junit.jupiter.api.Assertions.*
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.assertDoesNotThrow
//import org.junit.jupiter.api.assertThrows
//import java.lang.RuntimeException
//
//internal class CircleTest {
//
//    @Test
//    fun isValidCircle() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//
//        var radii: MutableList<Double> = mutableListOf()
//        radii.add(1.toDouble())
//        radii.add(1.toDouble())
//
//        assertDoesNotThrow<Circle> {
//            makeCircle(points, radii)
//        }
//
//        var radii2: MutableList<Double> = mutableListOf()
//        radii2.add(1.toDouble())
//        radii2.add(2.toDouble())
//
//        assertThrows<RuntimeException> {
//            makeCircle(points, radii2)
//        }
//
//        var radii3: MutableList<Double> = mutableListOf()
//        radii3.add(1.toDouble())
//
//        assertThrows<RuntimeException> {
//            makeCircle(points, radii3)
//        }
//    }
//
//    private fun makeCircle(points: MutableList<Point>, radii: MutableList<Double>): Circle {
//        return Circle(points, radii)
//    }
//
//}