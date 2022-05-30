package Strategies

import CompositeStrategy
import Line
import Point
import Shape

class MakeLine(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Line(points.subList(0, 2)))
        return shapes
    }

}