class CompositeShape(_shapes: MutableList<Shape>, _points: MutableList<Point>): Shape(_points){
    var shapes: MutableList<Shape> = _shapes
        private set
    init {

    }

    override fun getArea(): Double {
        return shapes[0].getArea() + shapes[1].getArea()
    }

//    fun getLength() {
//        return shapes[0].getLength() + shapes[1].getHeight()
//    }
//
//    fun getHeight() {
//
//    }
    private fun checkShapeValidity() {

    }

    override fun getShapeType(): String {
        return "Composite"
    }

}