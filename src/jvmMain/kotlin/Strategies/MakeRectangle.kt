package Strategies

import CompositeStrategy
import Rectangle
import Point
import Shape

class MakeRectangle(): CompositeStrategy {

    override fun makeShape(shapeInfo: MutableList<String>): Shape {

        var type = shapeInfo[0]
        shapeInfo.removeAt(0)

        var points = getPoints(shapeInfo)

        return Rectangle(points)
    }

}