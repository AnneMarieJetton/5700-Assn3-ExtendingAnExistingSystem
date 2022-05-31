package Strategies

import CompositeStrategy
import Pentagon
import Point
import Shape

class MakePentagon(): CompositeStrategy {

    override fun makeShape(shapeInfo: MutableList<String>): Shape {

        var type = shapeInfo[0]
        shapeInfo.removeAt(0)

        var points = getPoints(shapeInfo)

        return Pentagon(points)
    }

}