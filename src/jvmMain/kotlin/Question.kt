import kotlin.random.Random

class Question(_shape: Shape) {
    var shape: Shape = _shape

    //make point string and radii string
    private var pointString: String = ""
    private var radiiString: String = ""
    private var rand: Int = 0;

    var qString: String = ""
    var aString: String = ""

    init {
        createPointsAndRadiiString()
        if (shape.getShapeType() == "Circle" || shape.getShapeType() == "Ellipse") {
            rand = Random.nextInt(4, 7)
        }
        else{
            rand = Random.nextInt(1, 4)
        }
//        qString = questionDictionary[rand].toString()
//        aString = answerDictionary[rand].toString()
    }

    val questionDictionary = mapOf<Int, String>(
        1 to "A " + shape.getShapeType() + " has the points " + pointString + ". What is the area of the " + shape.getShapeType() + " ?",
        2 to "A " + shape.getShapeType() + " has the points " + pointString + ". What is half of the area of the " + shape.getShapeType() + " ?",
        3 to "A " + shape.getShapeType() + " has the points " + pointString + ". What is 3 times the area of the " + shape.getShapeType() + " ?",
        4 to "A " + shape.getShapeType() + " has the point " + pointString + " and radii " + radiiString + ". What is the area of the " + shape.getShapeType() + " ?",
        5 to "A " + shape.getShapeType() + " has the point " + pointString + " and radii " + radiiString + ". What is half of the area of the " + shape.getShapeType() + " ?",
        6 to "A " + shape.getShapeType() + " has the point " + pointString + " and radii " + radiiString + ". What is 4 times the area of the " + shape.getShapeType() + " ?",
    )

    val answerDictionary = mapOf<Int, String>(
        1 to "Correct answer: " + shape.getArea(),
        2 to "Correct answer: " + shape.getArea()/2,
        3 to "Correct answer: " + shape.getArea()*3,
        4 to "Correct answer: " + shape.getArea(),
        5 to "Correct answer: " + shape.getArea()/2,
        6 to "Correct answer: " + shape.getArea()*4,
    )

    init {
        qString = questionDictionary[rand].toString()
        aString = answerDictionary[rand].toString()
    }

    private fun createPointsAndRadiiString(){
        for(point in shape.points) {
            pointString = pointString + "(" + point.x + "," + point.y + ")"
            if (point != shape.points[shape.points.size - 1]){
                pointString = pointString + ", "
            }
        }

        if(shape.getShapeType() == "Circle" || shape.getShapeType() == "Ellipse"){
            for(radius in shape.getRadiiList()!!){
                radiiString = radiiString + radius.toInt() + " "
//                var commaAdded = false
//                if (!commaAdded){
//                    commaAdded = true
//                    radiiString = radiiString + ", and "
//                }

//                if (radius != shape.getRadiiList()!![shape.getRadiiList()!!.size]){
//                    pointString = pointString + ", "
//                }
            }
        }
    }

}