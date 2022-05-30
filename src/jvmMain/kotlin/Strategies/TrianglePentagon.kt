package Strategies

import CompositeStrategy
import Pentagon
import Triangle
import Point
import Shape

class TrianglePentagon(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Triangle(points.subList(0, 2)))
        shapes.add(Pentagon(points.subList(2, 4)))
        return shapes
    }

}