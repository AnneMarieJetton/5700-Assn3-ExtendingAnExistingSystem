// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import java.io.FileWriter

@Composable
@Preview
fun App() {
    MaterialTheme {

//        var textFieldInput by remember { mutableStateOf("") }
//        var questions = remember { mutableStateListOf<Question>() }
//        var curQuestion = remember{ mutableStateOf(Question) }
        var screen by remember { mutableStateOf("HomeScreen") }

//        TextField(textFieldInput,
//            onValueChange = { newValue ->
//                textFieldInput = newValue
//            }
//        )
        if(screen == "HomeScreen") {
            Button(
                onClick = { screen = "TestPage" }) {
                Text("Begin Test")

            }
        }
        else{
            TestView({screen = "HomeScreen"})
        }

    }
}

@Composable
fun TestView(callback: () -> Unit){
    var questions = TestRunner.questions
    var questionNum by remember { mutableStateOf(0) }
    var textFieldInput by remember { mutableStateOf("") }

//    println(questions.size)

    Column {
        Text(
            questions[questionNum].qString
        )
        TextField(textFieldInput,
            onValueChange = { newValue ->
                textFieldInput = newValue
            }
        )
        Button(
            onClick = {
                if(questionNum == questions.size-1){
                    callback.invoke()
                }
                else{
//                    csv & text file
                    //write current question to file
                    //write student answer to file
                    //write real answer to different file
                    writeToFiles(questions[questionNum].qString, textFieldInput, questions[questionNum].aString)
                    questionNum = questionNum + 1
                }
            }) {
            Text("Submit")
        }
    }
}

fun main() {
    TestRunner.runTest()
    application {
        Window(onCloseRequest = ::exitApplication) {
            App()
        }
    }
}

fun writeToFiles(question: String, answer: String, trueAnswer: String){
    try {
        var textFile = FileWriter("test.txt",true)
        var CSVFile = FileWriter("TestAnswers.csv", true)
        textFile.write(question + "\n")
        textFile.write(answer + "\n")
        textFile.close()
        CSVFile.write(trueAnswer + "\n")
        CSVFile.close()
    }catch(ex:Exception){
        print(ex.message)
    }


}

