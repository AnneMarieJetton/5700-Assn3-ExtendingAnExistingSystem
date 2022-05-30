interface CompositeStrategy {

    fun makeShape(points: MutableList<Point>): MutableList<Shape> {
        var facade = mutableListOf<Shape>()
        return facade
    }

}