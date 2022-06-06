//import org.junit.jupiter.api.Assertions.*
//import org.junit.jupiter.api.Test
//import java.lang.RuntimeException
//
//internal class SquareTest {
//
//    @Test
//    fun isValidSquare() {
//        var points: MutableList<Point> = mutableListOf()
//        points.add(Point(0.toDouble(), 0.toDouble()))
//        points.add(Point(1.toDouble(), 1.toDouble()))
//
//        org.junit.jupiter.api.assertDoesNotThrow<Square> {
//            makeSquare(points)
//        }
//
//        var points2: MutableList<Point> = mutableListOf()
//        points2.add(Point(0.toDouble(), 0.toDouble()))
//        points2.add(Point(1.toDouble(), 2.toDouble()))
//
//        org.junit.jupiter.api.assertThrows<RuntimeException> {
//            makeSquare(points2)
//        }
//
//        var points3: MutableList<Point> = mutableListOf()
//        points3.add(Point(0.toDouble(), 0.toDouble()))
//
//        org.junit.jupiter.api.assertThrows<RuntimeException> {
//            makeSquare(points3)
//        }
//
//    }
//
//    private fun makeSquare(points: MutableList<Point>): Square {
//        return Square(points)
//    }
//
//}