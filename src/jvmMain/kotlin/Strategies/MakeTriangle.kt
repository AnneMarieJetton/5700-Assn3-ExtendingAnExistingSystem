package Strategies

import CompositeStrategy
import Triangle
import Point
import Shape

class MakeTriangle(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>, radii: MutableList<Double>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Triangle(points.subList(0, 2)))
        return shapes
    }

}