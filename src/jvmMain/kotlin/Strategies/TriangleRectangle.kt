package Strategies

import CompositeStrategy
import Rectangle
import Triangle
import Point
import Shape

class TriangleRectangle(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Triangle(points.subList(0, 2)))
        shapes.add(Rectangle(points.subList(2, 4)))
        return shapes
    }

}