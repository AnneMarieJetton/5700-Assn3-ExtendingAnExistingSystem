package Strategies

import Circle
import CompositeStrategy
import Point
import Shape

class MakeCircle(): CompositeStrategy {

    override fun makeShape(shapeInfo: MutableList<String>): Shape {

        var type = shapeInfo[0]
        shapeInfo.removeAt(0)

        var radii = getRadii(shapeInfo)
        shapeInfo.removeAt(0)
        shapeInfo.removeAt(0)

        var points = getPoints(shapeInfo)

        return Circle(points, radii)
    }

}