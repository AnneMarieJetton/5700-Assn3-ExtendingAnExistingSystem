package Strategies

import CompositeStrategy
import Ellipse
import Point
import Shape


class MakeEllipse(): CompositeStrategy {

    override fun makeShape(shapeInfo: MutableList<String>): Shape {

        var type = shapeInfo[0]
        shapeInfo.removeAt(0)

        var radii = getRadii(shapeInfo)
        shapeInfo.removeAt(0)
        shapeInfo.removeAt(0)

        var points = getPoints(shapeInfo)

        return Ellipse(points, radii)
    }

}