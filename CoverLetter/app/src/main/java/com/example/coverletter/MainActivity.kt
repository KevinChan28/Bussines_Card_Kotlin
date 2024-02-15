package com.example.coverletter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coverletter.ui.theme.CoverLetterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoverLetterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(android.graphics.Color.parseColor("#512BD4"))
                ) {
                        CoverLetterImage(name = "Kevin Chan", rol = "Backend Developer")
                }
            }
        }
    }
}

@Composable
fun ShowName(name: String, rol: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            fontSize = 50.sp,
            lineHeight = 66.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = rol,
            fontSize = 25.sp,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun ShowEmail(email: String, modifier: Modifier = Modifier){
    Text(
        text = email,
        modifier = Modifier.padding(4.dp),
        textAlign = TextAlign.Left
    )
}
@Composable
fun CoverLetterImage(name: String, rol: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val image = painterResource(R.drawable.c_sharp_c_logo_02f17714ba_seeklogo_com)

        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = image, contentDescription = null)
            ShowName(
                name = name,
                rol = rol,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 8.dp, end = 8.dp) // Ajusta según sea necesario
            )
            ShowEmail(email = "kevinchan200145@gmail.com")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CoverLetterPreview() {
    CoverLetterTheme {
        CoverLetterImage("Kevin Chan", "Backend Developer")
    }
}