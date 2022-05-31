package Strategies

import CompositeStrategy
import Line
import NPointStar
import Point
import Shape

class MakeNPointStar(): CompositeStrategy {

    override fun makeShape(shapeInfo: MutableList<String>): Shape {

        var type = shapeInfo[0]
        shapeInfo.removeAt(0)

        var points = getPoints(shapeInfo)

        return NPointStar(points)
    }

}