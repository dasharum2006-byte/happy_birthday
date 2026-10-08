package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
//выравнивание по вертикали
import androidx.compose.foundation.layout.Arrangement
//выравнивание по горизонтали
import androidx.compose.ui.Alignment
//для изобрвжения импорты
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            //колонка на весь экран с розовым фоном
            // порядок вызова функций внутри Модификатора имеет решающее значение
                Column(modifier = androidx.compose.ui.Modifier
                    .background(Color(0xFFE7C0CD))
                    .fillMaxSize(),
                    //центрирование по вертикали
                    verticalArrangement = Arrangement.Center,
                    //выравнивание по горизонтали
                    horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                Text (
                    text = "С Днем Рождения, Веруня!",
                    fontSize = 35.sp,
                    color = Color(0xFFC71585)
                )
                            //отступ между текстом и картинкой
                    Spacer(modifier = androidx.compose.ui.Modifier.height(24.dp))

                Image (
                    //В Котлине это пишется через специальный системный указатель R.drawable.
                    painter = painterResource(R.drawable.hb_cake),
                    contentDescription = "Торт",
                    modifier = androidx.compose.ui.Modifier.size(350.dp)

                    //clip - обрезаем по форме -  нам надо убрать углы у картинки
                    .clip(androidx.compose.foundation.shape.RoundedCornerShape(16.dp))
                    .border(
                        //толщина рамки
                        width = 3.dp,
                        color = Color(0xFFC71585),
                        //форма рамки - и она должна совпадать с скруглением
                        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp)
                    )
                )
                }
        }
    }
}

