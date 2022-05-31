package Strategies

import CompositeStrategy
import Square
import Point
import Shape

class MakeSquare(): CompositeStrategy {

    override fun makeShape(shapeInfo: MutableList<String>): Shape {

        var type = shapeInfo[0]
        shapeInfo.removeAt(0)

        var points = getPoints(shapeInfo)

        return Square(points)
    }

}