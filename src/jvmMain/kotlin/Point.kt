class Point(x: Double, y: Double) {
    var x: Double = x
    var y: Double = y

    fun clonePoint(): Point {
        return Point(x, y)
    }

    fun movePointX(change: Int){
        x += change
    }

    fun movePointY(change: Int) {
        y += change
    }

}