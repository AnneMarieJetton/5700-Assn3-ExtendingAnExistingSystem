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
                var splitLine = it.split(",").toMutableList()

                var shapeType = splitLine[0]
                splitLine.removeAt(0)


                var radii = mutableListOf<Double>()
                if (splitLine[0] == "circle" || splitLine[0] == "ellipse"){
                    radii.add(splitLine[1].toDouble())
                    radii.add(splitLine[2].toDouble())
                    splitLine.removeAt(0)
                    splitLine.removeAt(0)
                }

                var points = makePoints(splitLine.toMutableList())

                if (compositeDictionary.containsKey(shapeType)) {
                    var shapes = compositeDictionary[shapeType]!!.makeShape(points, radii)
                    var newShape = CompositeShape(shapes, points)
                    addQuestion(Question(newShape))
                }
                else if(shapeDictionary.containsKey(shapeType)) {
                    var newShape = shapeDictionary[shapeType]!!.makeShape(points, radii)
                    addQuestion(Question(newShape[0]))
                }
                else {
                    //throw error
                }
            }
        }

        fun makePoints(splitLine: MutableList<String>): MutableList<Point> {
            var points = mutableListOf<Point>()
//            splitLine.removeAt(0)

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