package Strategies

import CompositeStrategy
import Triangle
import Point
import Shape

class DoubleTriangle(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>, radii: MutableList<Number>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Triangle(points.subList(0, 2)))
        shapes.add(Triangle(points.subList(2, 4)))
        return shapes
    }

}