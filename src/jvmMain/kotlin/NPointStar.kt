class NPointStar(_points: MutableList<Point>): Shape(_points) {
    var lines = mutableListOf<Line>()

    init {
        createLines()
    }


    override fun getShapeType(): String {
        return "NPointStar"
    }

    override fun getArea(): Double {
        var area = 0.0
        for (line in lines){
            area = area + line.getArea()
        }
        return area
    }

    private fun createLines() {
        var builder = mutableListOf<Point>()
        for (point in points) {
            if (builder.size == 0) {
                builder.add(point)
            } else {
                builder.add(point)
                lines.add(Line(builder))
                builder.clear()
            }
        }
    }
}