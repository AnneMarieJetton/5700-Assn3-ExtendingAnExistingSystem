open abstract class Shape (_points: MutableList<Point>){
    var points: MutableList<Point> = _points

    fun moveShape(x: Int, y: Int){
        points.forEach {
            it.movePointX(x)
            it.movePointY(y)
        }
    }

    abstract fun getArea(): Double

    abstract fun getShapeType(): String

}