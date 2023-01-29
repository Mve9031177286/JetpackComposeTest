package com.maximvs.jetpackcomposetest.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maximvs.jetpackcomposetest.ui.theme.JetpackComposeTestTheme


@Composable
fun InstagramProfileCard() {
    Card(  // вызвал функцию Card (импортирую), есть параметры: бордер, шейп, элеватион и пр.
        modifier = Modifier
            .padding(8.dp),
        shape = RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 4.dp,
        ),
        backgroundColor = MaterialTheme.colors.background,
        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Yellow)
            ) {

            }
            TwoBoxes()
            TwoBoxes()
            TwoBoxes()

        }
    }
}

@Composable
private fun TwoBoxes() {
    Column(
        modifier = Modifier
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .size(25.dp)
                .background(color = Color.Blue)
        ) {

        }
        Box(
            modifier = Modifier
                .size(25.dp)
                .background(color = Color.Red)
        ) {

        }

    }
}

@Preview
@Composable
fun PreviewCardLight() {
    JetpackComposeTestTheme (
        darkTheme = false
            ){
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun PreviewCardDark() {
    JetpackComposeTestTheme (
        darkTheme = true
            ){
        InstagramProfileCard()
    }
}