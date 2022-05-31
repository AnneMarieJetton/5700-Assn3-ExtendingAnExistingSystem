import java.lang.IllegalArgumentException

class Circle(_points: MutableList<Point>, _radii: MutableList<Double>): Ellipse(_points, _radii) {

    init {
        require(checkRadiiEquality(), { "Error: Area must be non-zero, and radii must be equal." })
        require(checkListSize(), { "Error: must have one point and 2 radii" })
    }

    private fun checkRadiiEquality(): Boolean {
        if (getArea() == 0.toDouble()){
            return false
        }
        if (radii[0] != radii[1]) {
            return false
        }

        return true
    }

    override fun getShapeType(): String {
        return "Circle"
    }

}