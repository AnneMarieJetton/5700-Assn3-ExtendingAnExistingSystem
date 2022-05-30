package Strategies

import CompositeStrategy
import Square
import Point
import Shape

class MakeSquare(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>, radii: MutableList<Double>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()
        shapes.add(Square(points.subList(0, 2)))
        return shapes
    }

}