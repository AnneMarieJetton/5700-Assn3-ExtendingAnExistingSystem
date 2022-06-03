import kotlin.math.abs

open class Rectangle(_points: MutableList<Point>): Shape(_points) {

    init {
        require(checkWidthHeight(), {"Error: Width and height must be non-zero"})
        require(checkListSize(), { "Error: must have 2 points" })
    }

    override fun getArea(): Double {
        return getWidth() * getHeight()
    }

    fun getWidth(): Double {
        return abs(points[1].x - points[0].x)
    }

    fun getHeight(): Double {
        return abs(points[1].y - points[0].y)
    }

    private fun checkWidthHeight(): Boolean {
        if (getWidth() == 0.toDouble() || getHeight() == 0.toDouble()){
            return false
        }
        return true
    }

    fun checkListSize(): Boolean {
        if(points.size != 2) {
            return false
        }
        return true
    }

    override fun getShapeType(): String {
        return "Rectangle"
    }

    override fun getRadiiList(): MutableList<Double>? {
        return null
    }

}