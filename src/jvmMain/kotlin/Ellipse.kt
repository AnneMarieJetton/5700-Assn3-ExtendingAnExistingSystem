open class Ellipse(_points: MutableList<Point>, _radii: MutableList<Double>): Shape(_points) {
    var radii: MutableList<Double> = _radii

    init {
        require(checkArea(), {"Error: Area must be non-zero."})
        require(checkListSize(), { "Error: must have one point and 2 radii" })
    }

    override fun getArea(): Double {
        return Math.PI * radii[0] * radii[1]
    }

    private fun checkArea(): Boolean {
        if (getArea() == 0.toDouble()){
            return false
        }
        return true
    }

    fun checkListSize(): Boolean {
        if(points.size != 1 && radii.size != 2) {
            return false
        }
        return true
    }

    override fun getShapeType(): String {
        return "Ellipse"
    }

}