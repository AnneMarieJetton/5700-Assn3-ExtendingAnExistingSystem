package Strategies

import CompositeShape
import CompositeStrategy
import Point
import Shape
import ShapeFactory

class MakeCompositeShape(): CompositeStrategy {

    override fun makeShape(shapeInfo: MutableList<String>): Shape {
        var shapes = ShapeFactory.createShapes(shapeInfo)

//        shapeInfo.removeAt(0)
//        shapeInfo.removeAt(0)
//        shapeInfo.removeAt(0)

        var points = mutableListOf<Point>()
        for(shape in shapes){
            points = (points + shape.points) as MutableList<Point>
        }

        return CompositeShape(shapes, points)
    }

}