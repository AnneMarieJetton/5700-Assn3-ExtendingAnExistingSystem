class Pentagon (_points: MutableList<Point>): Shape(_points) {

    override fun getShapeType(): String {
        return "Pentagon"
    }

    override fun getArea(): Double {
        //this is the shoelace formula

        var area = (
                (points[0].x)*(points[4].y) -
                (points[4].x)*(points[0].y) +
                (points[4].x)*(points[3].y) -
                (points[3].x)*(points[4].y) +
                (points[3].x)*(points[2].y) -
                (points[2].x)*(points[3].y) +
                (points[2].x)*(points[1].y) -
                (points[1].x)*(points[2].y) +
                (points[1].x)*(points[0].y) -
                (points[0].x)*(points[1].y)
                ) / 2
        return area
    }

}