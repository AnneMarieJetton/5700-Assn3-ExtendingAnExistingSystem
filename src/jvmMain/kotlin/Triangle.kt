import kotlin.math.abs
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(points: MutableList<Point>): Shape(points) {

    init {
        require(checkArea(), { "Error: Area must be non-zero." })
        require(checkListSize(), { "Error: must have 3 points" })
    }

    private fun checkArea(): Boolean {
        if (getArea() == 0.toDouble()) {
            return false
        }
        return true
    }

    override fun getArea(): Double {
        val side1 = sqrt((points[1].x - points[0].x).pow(2) + (points[1].y - points[0].y).pow(2))
        val side2 = sqrt((points[2].x - points[1].x).pow(2) + (points[2].y - points[1].y).pow(2))
        val side3 = sqrt((points[0].x - points[2].x).pow(2) + (points[0].y - points[2].y).pow(2))

        val s = (side1+side2+side3)/2

        return sqrt(s*(s-side1)*(s-side2)*(s-side3))
    }

    fun checkListSize(): Boolean {
        if(points.size != 3) {
            return false
        }
        return true
    }

    override fun getShapeType(): String {
        return "Triangle"
    }

}