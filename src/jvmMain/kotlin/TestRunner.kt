import Strategies.*
import java.io.File

class TestRunner private constructor(){

    companion object {
        var questions = mutableListOf<Question>()
            private set

        fun addQuestion(question: Question){
            questions.add(question)
        }

        fun runTest(){
//            val doublePentagon = DoublePentagon()
//            val doubleRectangle = DoubleRectangle()
//            val doubleTriangle = DoubleTriangle()
//            val rectanglePentagon = RectanglePentagon()
//            val trianglePentagon = TrianglePentagon()
//            val triangleRectangle = TriangleRectangle()
//            val compositeDictionary = mapOf<String, CompositeStrategy>(
//                "doublePentagon" to doublePentagon,
//                "doubleRectangle" to doubleRectangle,
//                "doubleTriangle" to doubleTriangle,
//                "rectanglePentagon" to rectanglePentagon,
//                "trianglePentagon" to trianglePentagon,
//                "triangleRectangle" to triangleRectangle,
//            )
//
            val makeCircle = MakeCircle()
            val makeEllipse = MakeEllipse()
            val makeLine = MakeLine()
            val makeNPointStar = MakeNPointStar()
            val makePentagon = MakePentagon()
            val makeRectangle = MakeRectangle()
            val makeSquare = MakeSquare()
            val makeTriangle = MakeTriangle()
            val makeCompositeShape = MakeCompositeShape()
            val shapeDictionary = mapOf<String, CompositeStrategy>(
                "Circle" to makeCircle,
                "Ellipse" to makeEllipse,
                "Line" to makeLine,
                "NPointStar" to makeNPointStar,
                "Pentagon" to makePentagon,
                "Rectangle" to makeRectangle,
                "Square" to makeSquare,
                "Triangle" to makeTriangle,
                "CompositeShape" to makeCompositeShape
            )

            var file = File("shapes.txt")

            file.forEachLine {
                var splitLine = it.split(",").toMutableList()
                
                if (shapeDictionary.containsKey(splitLine[0])){
                    addQuestion(Question( shapeDictionary[splitLine[0]]!!.makeShape(splitLine)))
                }
                else {
//                    ThrowError
                }

            }
        }
    }
}