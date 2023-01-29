package com.maximvs.jetpackcomposetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class UnitNeco4_5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.fillMaxSize(), // создаю контейнер Box для одного виджета - кнопки, во весь размер экрана
                contentAlignment = Alignment.Center  // располагаю содержимое Box в центре по вертикали и по горизонтали
            ) {
                CircleItem()  // старт fun CircleItem()
            }
        }
    }
}

@Preview
@Composable
fun CircleItem() { // будет счетчик, по нажатию увеличивающий число и меняющий цвета на 10 и 20
    val counter = remember {  // счетчик, но теперь в переменную записано состояние; в скобках -
        mutableStateOf(0)  // стартовая переменная; по ее изменению виджет перерисовывается
    }
    val color = remember {  // то же самое, уже для цвета; и т.к. в переменную записано состояние, то не var, а val
        mutableStateOf(Color.Blue) // меняться будет не сама переменная, она теперь
        // постоянная, а значение в скобках, значок состояния
    }
    Box(modifier = Modifier // Box - это и будет кнопка; модификаторами задаю:
        .size(100.dp)  // размер
        .background(color = color.value, shape = CircleShape)  // цвет (через состояние color.value) внешний вид(круг)
        .clickable {  // и кликабельность виджета; в фигурных скобках обрабатываю нажатие на виджет
            when (++counter.value) { // можно counter.value++ но тогда цвет поменяется после 10 и 20, т.е. на 11 и 21
                10 -> color.value = Color.Red  // 10 и далее -
                // цвет красный, писать Color.Red, androidx.compose.ui.graphics - не писать, а выбрать из предложенного Студией
                20 -> color.value = Color.Green  // 20 и далее - цвет зеленый
            }
        },
        contentAlignment = Alignment.Center){ // то, что находится в Box - будет по центру и по
        // вертикали, и по горизонтали, т.е Text будет по центру кнопки Box
        Text(text = counter.value.toString(), // т.к. в counter теперь записано сотояние - нужен value,
            // и приводим число (Int) к строке - toString()
            style = TextStyle(color = Color.White, fontSize = 20.sp)
        ) // установил цвет и размер текста
    }
}
