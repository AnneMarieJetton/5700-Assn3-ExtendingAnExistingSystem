package Strategies

import CompositeStrategy
import Ellipse
import Point
import Shape


class MakeEllipse(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>, radii: MutableList<Double>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Ellipse(points.subList(0, 2), radii))
        return shapes
    }

}