package Strategies

import CompositeStrategy
import Rectangle
import Point
import Shape

class MakeRectangle(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>, radii: MutableList<Double>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Rectangle(points.subList(0, 2)))
        return shapes
    }

}