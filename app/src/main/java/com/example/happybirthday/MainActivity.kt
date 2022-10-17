package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(message = "Happy Birthday Alp", from = "Alex")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(to: String, from: String) {
    Column {
        Text(
            text = to, fontSize = 24.sp, color = Color.Red,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp)
        )
        Text(
            text = from, fontSize = 24.sp, modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(stringResource(R.string.happy_birthday_text), "From Alex")
    }
}

@Composable
fun practiceArticle() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image, contentDescription = null, modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(8.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = "Jetpack Compose is a modern toolkit or building native android UI. " +
                    "Compose simplifies and accelerates UI development Jetpack Compose is a modern toolkit or building native android UI. \" +\n" +
                    "                    \"Compose simplifies and accelerates UI development ",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = "aaaaaassadwsadsadasdsdadasJetpack Compose is a modern toolkit or building native android UI. " +
                    "Compose simplifies and accelerates UI development Jetpack Compose is a modern toolkit or building native android UI. \" +\n" +
                    "                    \"Compose simplifies and accelerates UI development ",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }


}

@Composable
fun practiceTaskManager() {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = image, contentDescription = null)

        Text(
            text = "All tasks completed", fontSize = 24.sp,
            fontWeight = FontWeight.Bold,

            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp),
        )
        Text(text = "Nice Work", fontSize = 16.sp, textAlign = TextAlign.Center)
    }
}

@Composable
fun practiceQuadrant() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.Green)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "1 Text Composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Displays text and follows Material Design guidelines.",
                    fontFamily = FontFamily.Default,
                    textAlign = TextAlign.Justify
                )
            }
            Column( Modifier
                .fillMaxSize()
                .background(Color.Yellow)
                .padding(16.dp)
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "2 Text Composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Displays text and follows Material Design guidelines.",
                    fontFamily = FontFamily.Default,
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row(Modifier.weight(1f)) {
            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.Cyan)
                    .padding(16.dp).weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "3 Text Composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Displays text and follows Material Design guidelines.",
                    fontFamily = FontFamily.Default,
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "4 Text Composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Displays text and follows Material Design guidelines.",
                    fontFamily = FontFamily.Default,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true,
showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        //BirthdayGreetingWithImage(message = "Happy Birthday Alp", from = "Alex")
        practiceTaskManager()
        //practiceArticle()
        //practiceQuadrant()
    }
}