interface CompositeStrategy {

    abstract fun makeShape(shapeInfo: MutableList<String>): Shape

    fun getPoints(shapeInfo: MutableList<String>): MutableList<Point> {
        var points = mutableListOf<Point>()

        var builder = mutableListOf<Number>()
        for (number in shapeInfo){
            if (builder.size == 0){
                builder.add(number.toDouble())
            }
            else{
                builder.add(number.toDouble())
                points.add(Point(builder[0].toDouble(), builder[1].toDouble()))
                builder.clear()
            }
        }

        //check here for bad point data?

        return points
    }

    fun getRadii(shapeInfo: MutableList<String>): MutableList<Double> {
        var radii = mutableListOf<Double>()
        radii.add(shapeInfo[0].toDouble())
        radii.add(shapeInfo[1].toDouble())
        return radii
    }

}