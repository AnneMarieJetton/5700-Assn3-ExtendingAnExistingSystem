package Strategies

import CompositeStrategy
import Pentagon
import Point
import Shape

class DoublePentagon(): CompositeStrategy {
    override fun makeShape(points: MutableList<Point>, radii: MutableList<Double>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Pentagon(points.subList(0, 2)))
        shapes.add(Pentagon(points.subList(2, 4)))
        return shapes
    }
}