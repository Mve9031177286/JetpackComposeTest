package com.maximvs.jetpackcomposetest

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maximvs.jetpackcomposetest.CircleItem
import com.maximvs.jetpackcomposetest.ui.Test
import com.maximvs.jetpackcomposetest.ui.theme.JetpackComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTestTheme{ // метод из Theme.kt, для подключения темной темы (см.записи)
                Box (  // Box на весь экран, чтобы темная/светлая тема отображалась на вес экран,
                    modifier = Modifier  // а не только то, что поместилось в отображаемый файл
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                        ) {
                    //ColumnStart()

                }

            }

            Test()

            //ColumnSample()   // запуск кода MainActivity.kt

            /*Column() {       // запуск кода UnitNeco3.kt
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
            }*/

            /* Box(modifier = Modifier.fillMaxSize(),   // запуск кода UnitNeco4_5.kt
                contentAlignment = Alignment.Center ) {
                CircleItem()
            } */

            // ColumnStart()
        }
    }
}


@Preview(widthDp = 280, heightDp = 400)
@Composable
fun ColumnSample() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Box(
            modifier = Modifier
                .height(10.dp)
                .background(White)
        )
        repeat(7) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(fraction = 0.8f)
                    .height(36.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(Blue)

            )

            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Preview
@Composable
fun CardTest() {

}


