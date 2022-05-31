package Strategies

import CompositeShape
import CompositeStrategy
import Shape
import ShapeFactory

class MakeCompositeShape(): CompositeStrategy {

    override fun makeShape(shapeInfo: MutableList<String>): Shape {
        var shapes = ShapeFactory.createShapes(shapeInfo)

        shapeInfo.removeAt(0)
        shapeInfo.removeAt(0)
        shapeInfo.removeAt(0)

        var points = getPoints(shapeInfo)

        return CompositeShape(shapes, points)
    }

}