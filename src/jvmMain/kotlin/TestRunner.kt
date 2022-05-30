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
            val doublePentagon = DoublePentagon()
            val doubleRectangle = DoubleRectangle()
            val doubleTriangle = DoubleTriangle()
            val rectanglePentagon = RectanglePentagon()
            val trianglePentagon = TrianglePentagon()
            val triangleRectangle = TriangleRectangle()
            val compositeDictionary = mapOf<String, CompositeStrategy>(
                "doublePentagon" to doublePentagon,
                "doubleRectangle" to doubleRectangle,
                "doubleTriangle" to doubleTriangle,
                "rectanglePentagon" to rectanglePentagon,
                "trianglePentagon" to trianglePentagon,
                "triangleRectangle" to triangleRectangle,
            )

            val makeCircle = MakeCircle()
            val makeEllipse = MakeEllipse()
            val makeLine = MakeLine()
            val makeNPointStar = MakeNPointStar()
            val makePentagon = MakePentagon()
            val makeRectangle = MakeRectangle()
            val makeSquare = MakeSquare()
            val makeTriangle = MakeTriangle()
            val shapeDictionary = mapOf<String, CompositeStrategy>(
                "makeCircle" to makeCircle,
                "makeEllipse" to makeEllipse,
                "makeLine" to makeLine,
                "makeNPointStar" to makeNPointStar,
                "makePentagon" to makePentagon,
                "makeRectangle" to makeRectangle,
                "makeSquare" to makeSquare,
                "makeTriangle" to makeTriangle,
            )

            var file = File("shapes.txt")

            file.forEachLine {
                var splitLine = it.split(",")

                var points = makePoints(splitLine.toMutableList())

                if (compositeDictionary.containsKey(splitLine[0])) {
                    var shapes = compositeDictionary[splitLine[0]]!!.makeShape(points)
                    var newShape = CompositeShape(shapes, points)
//                    var newShape = shapes?.let { it1 -> CompositeShape(it1, points) }
                    addQuestion(Question(newShape))
//                    newShape?.let { it1 -> Question(it1) }?.let { it2 -> addQuestion(it2) }
                }
                else if(shapeDictionary.containsKey(splitLine[0])) {
                    var newShape = shapeDictionary[splitLine[0]]!!.makeShape(points)
//                    addQuestion(Question(shapes[0]))
                    addQuestion(Question(newShape[0]))
                }
                else {
                    //throw error
                }
            }
        }

        fun makePoints(splitLine: MutableList<String>): MutableList<Point> {
            var points = mutableListOf<Point>()
            splitLine.removeAt(0)

            var builder = mutableListOf<Number>()
            for (number in splitLine){
                if (builder.size == 0){
                    builder.add(number.toDouble())
                }
                else{
                    builder.add(number.toDouble())
                    points.add(Point(builder[0].toDouble(), builder[1].toDouble()))
                    builder.clear()
                }
            }

            //check here for bad point data?

            return points
        }
    }
}