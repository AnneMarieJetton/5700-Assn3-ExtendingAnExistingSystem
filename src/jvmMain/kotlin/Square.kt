class Square(_points: MutableList<Point>): Rectangle(_points) {

    init {
        require(checkWidthHeightEquality(), {"Error: Width and height must be non-zero, and must be equal."})
        require(checkListSize(), { "Error: must have 2 points" })
    }

    private fun checkWidthHeightEquality(): Boolean {
        if (getWidth() == 0.toDouble() || getHeight() == 0.toDouble()){
            return false
        }
        if (getWidth() != getHeight()){
            return false
        }
        return true
    }

    override fun getShapeType(): String {
        return "Square"
    }
}