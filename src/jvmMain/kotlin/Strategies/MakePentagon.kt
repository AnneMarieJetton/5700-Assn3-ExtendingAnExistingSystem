package Strategies

import CompositeStrategy
import Pentagon
import Point
import Shape

class MakePentagon(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>, radii: MutableList<Double>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Pentagon(points.subList(0, 2)))
        return shapes
    }

}