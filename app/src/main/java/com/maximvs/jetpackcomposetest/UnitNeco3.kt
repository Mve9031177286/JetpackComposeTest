package com.maximvs.jetpackcomposetest

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.maximvs.jetpackcomposetest.ui.theme.JetpackComposeTestTheme

class UnitNeco3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
                ListItem("Zac Efron", "Actor")
            }
        }
    }
}

// @Preview запустить здесь не получится, fun ListItem требует входных параметров, которых пока нет. Потому - см.строки 85-89
@Composable
fun ListItem(name: String, prof: String){
    Card(  // контейнер Card, замена CardView, можно использовать в качестве родительского представления для объявления внутри него
        // нескольких элементов пользовательского интерфейса. У него есть свойство высоты, которое применяет эффект тени вокруг него.
        modifier = Modifier // представляет объект Modifier, который определяет модификаторы компонента:
            .fillMaxWidth() // во всю ширину экрана, затем задам отступы, след.строка
            .padding(10.dp), // расстояние от границ экрана до Card, здесь - со всех сторон
            shape = RoundedCornerShape(15.dp), // скругление углов Card
            elevation = 5.dp // элемент парения Card над экраном, размер тени
    ) {
        Box(){    // контейнер Box, очень простой, в него кладется только один элемент, здесь - Row. Либо вообще без элементов,
            // можно просто раскрасить (см. MainActivity)
            Row( // контейнер Row, в нем будет горизонтальное расположение эементов: Image, затем, правее - Column
                verticalAlignment = Alignment.CenterVertically // все элементы, расположенные внутри Row, будут расположены
                // в центре вертикали
            ) {
                Image(  // Выбираю Image (painter...) - Это важно! Иначе может не появиться фото. Вообще возможны 3 варианта,
                    // см. избранное в браузере Майкрософт, Метанит
                    painter = painterResource(id = R.drawable.photo), // выбор картинки
                    contentDescription = "image", // описание контента, находящегося в компоненте, применяется
                    // сервисами accessibility в служебных целях
                    contentScale = ContentScale.Crop, // обрезка того, что не влезает
                    modifier = Modifier
                        .padding(5.dp) // внутренние отступы вокруг картинки, до границ Image
                        .size(64.dp) // размер картинки
                        .clip(CircleShape)  // картинка - в круге
                )
                Column( // контейнер Column, в нем два Text будут расположены по вертикали, один над другим
                    modifier = Modifier.padding(start = 16.dp) // расстояние от Image до текстов
                ) {
                    Text(text = name)
                    Text(text = prof)
                }

            }
        }
    }
}

@Preview  // вот так запускается просмотр созданной функции без запуска приложения, строки 85-89: создается fun PrevListItem()
@Composable  // и в нее кладется ListItem(name = "Максим", prof = "Разработчик") с какими-либо параметрами, без разницы,
fun PrevListItem(){ // т.к. это только для просмотра, как будет выглядеть элемент Card
    ListItem(name = "Максим", prof = "Разработчик")
}

private operator fun Role.invoke(painter: Painter, contentDescription: String, contentScale: ContentScale, modifier: Modifier) {
   // функция добавлена по хотелкам Студии, предназначение непонятно
}
