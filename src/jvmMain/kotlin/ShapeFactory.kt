import Strategies.*


class ShapeFactory private constructor() {

    companion object {
        fun createShapes(shapeInfo: MutableList<String>): MutableList<Shape> {
            var shapes = mutableListOf<Shape>()

            val makeCircle = MakeCircle()
            val makeEllipse = MakeEllipse()
            val makeLine = MakeLine()
            val makePentagon = MakePentagon()
            val makeRectangle = MakeRectangle()
            val makeSquare = MakeSquare()
            val makeTriangle = MakeTriangle()
            val shapeDictionary = mapOf<String, CompositeStrategy>(
                "Circle" to makeCircle,
                "Ellipse" to makeEllipse,
                "Line" to makeLine,
                "Pentagon" to makePentagon,
                "Rectangle" to makeRectangle,
                "Square" to makeSquare,
                "Triangle" to makeTriangle,
            )

            val sizeRect = listOf(0,0,0,0)
            val sizeTri = listOf(0,0,0,0,0,0)
            val sizePent = listOf(0,0,0,0,0,0,0,0,0,0)
            val shapeSizeDictionary = mapOf<String, List<Int>>(
                "Circle" to sizeRect,
                "Ellipse" to sizeRect,
                "Line" to sizeRect,
                "Pentagon" to sizePent,
                "Rectangle" to sizeRect,
                "Square" to sizeRect,
                "Triangle" to sizeTri,
            )



            var requests = mutableListOf<String>()
            for(request in shapeInfo) {
                if (shapeDictionary.containsKey(request)){
                    requests.add(request)
                }
            }

            if(shapeInfo[0] == "CompositeShape"){
                shapeInfo.removeAt(0)
            }

            for (request in requests){
                shapeInfo.removeAt(0)
            }

            for (request in requests){
                var miniInfo = mutableListOf<String>()
                miniInfo.add(request)
                var shapeSize = shapeSizeDictionary[request]!!.size
                for (bit in shapeInfo.subList(0, shapeSize)){
                    miniInfo.add(bit)
                }
                shapes.add(shapeDictionary[request]!!.makeShape(miniInfo))
                for(bit in shapeSizeDictionary[request]!!){
                    shapeInfo.removeAt(0)
                }
            }

            return shapes
        }
    }
}