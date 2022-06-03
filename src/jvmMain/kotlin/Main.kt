// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    MaterialTheme {
        TestRunner.runTest()

        var textFieldInput by remember { mutableStateOf("") }
        var questions = remember { mutableStateListOf<Question>() }
//        var curQuestion = remember{ mutableStateOf(Question) }

        TextField(textFieldInput,
            onValueChange = { newValue ->
                textFieldInput = newValue
            }
        )
        Button(
            onClick = {}) {
            Text("Begin Test")

        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
