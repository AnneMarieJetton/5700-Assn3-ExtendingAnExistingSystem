interface CompositeStrategy {

    fun makeShape(points: MutableList<Point>, radii: MutableList<Double>): MutableList<Shape> {
        var facade = mutableListOf<Shape>()
        return facade
    }

}