package com.maximvs.jetpackcomposetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class TimesTable : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Preview
@Composable
fun TimesTablee() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        for (i in 1 until 10) { // цикл, переменная i, перебираю от 1 до 10
                                      // не включая 10, это номер строки
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                for (j in 1 until 10) { // цикл, переменная j, перебираю от 1 до 10 не
                    // включая 10, это номер столбца (он же номер Box'а в очередной строке)
                    val color = if ((i + j) % 2 == 0) {
                        Color.Green
                    } else {
                        Color.White
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .border(width = 1.dp, color = Color.Magenta)
                            .background(color = color),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "${i * j}")
                    }
                }
            }
        }
    }
}

