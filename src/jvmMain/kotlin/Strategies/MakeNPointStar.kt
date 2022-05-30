package Strategies

import CompositeStrategy
import Line
import Point
import Shape

class MakeNPointStar(): CompositeStrategy {

    override fun makeShape(points: MutableList<Point>): MutableList<Shape> {
        var shapes = mutableListOf<Shape>()

        var builder = mutableListOf<Point>()
        for (point in points){
            if (builder.size == 0){
                builder.add(point)
            }
            else{
                builder.add(point)
                shapes.add(Line(builder))
                builder.clear()
            }
        }

        //check here for incorrect number of points?

        return shapes
    }

}