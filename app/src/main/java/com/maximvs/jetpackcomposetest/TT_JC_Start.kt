package com.maximvs.jetpackcomposetest

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIconDefaults.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maximvs.jetpackcomposetest.ui.theme.Orange

class TT_JC_Start : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Preview
@Composable
fun ColumnStart() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.65f)
                //.background(Color.Gray)
                .padding(20.dp, 30.dp, 20.dp, 10.dp), // отступы для того, что будет внутри Card
            shape = RoundedCornerShape(190.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_start),
                contentDescription = "image",
                contentScale = ContentScale.Crop, // обрезка того, что не влезает
                // modifier = Modifier
                //.size(450.dp) // размер картинки
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f)
                //.background(Color.Magenta)
                .padding(top = 10.dp)

        ) {
            Text(
                """|Добро пожаловать в
                |Tracking Travel""".trimMargin(), // строки 71-71: тройные кавычки, символы | и
                // метод .trimMargin() позволяют разбить строку на две нужным мне образом
                style = TextStyle(color = MaterialTheme.colors.onBackground, fontSize = 25.sp),
                textAlign = TextAlign.Center
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.45f)
                .padding(bottom = 5.dp)   // отступы вокруг закрашенной области
                //.background(Color.Blue)
                .padding(bottom = 10.dp)  // отступ внутри бокса

        ) {
            Text(
                text = stringResource(R.string.start_text_2),
                style = TextStyle(color = MaterialTheme.colors.onBackground, fontSize = 18.sp),
                textAlign = TextAlign.Center
            )
        }

        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors( // здесь:
                backgroundColor = Orange,         // цвет кнопки
                contentColor = Color.White        // и цвет текста кнопки
            ),
            modifier = Modifier
                .fillMaxWidth(0.88f)
                .fillMaxHeight(0.55f)
                //.height(62.dp)
                .clip(shape = RoundedCornerShape(100))
            //.background(Orange)) { // в скобках указываю цвет, который добавил в Color.kt - это
            // для Box, для изменения цвета кнопки - строка 96
        ) {
            Text(text = stringResource(R.string.start_btn), fontSize = 18.sp)
        }

    }
}








