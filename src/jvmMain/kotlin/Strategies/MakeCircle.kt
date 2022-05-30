package Strategies

import Circle
import CompositeStrategy
import Point
import Shape

class MakeCircle(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>, radii: MutableList<Double>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Circle(points.subList(0, 2), radii))
        return shapes
    }

}