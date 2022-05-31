package Strategies

import CompositeStrategy
import Triangle
import Point
import Shape

class MakeTriangle(): CompositeStrategy {

    override fun makeShape(shapeInfo: MutableList<String>): Shape {

        var type = shapeInfo[0]
        shapeInfo.removeAt(0)

        var points = getPoints(shapeInfo)

        return Triangle(points)
    }

}