package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(Modifier.fillMaxSize()) {
                        Box(modifier = Modifier.align(Alignment.Center)) {
                            MainCard(R.drawable.x, "Full Name", "Title")
                        }
                        Box(modifier = Modifier.align(Alignment.BottomCenter)) {
                            Contacts(
                                number = "+00(00) 123-45-67",
                                email = "email@gmail.com",
                                linkedIn = "@myLinkedIn"
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MainCard(img: Int, fullName: String, title: String) {

    Column(Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = img),
            contentDescription = null,
            Modifier
                .height(160.dp)
                .width(160.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = fullName,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }

}

@Composable
fun Contacts(number: String, linkedIn: String, email: String) {
    Column(Modifier.padding(bottom = 16.dp)) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.x),
                contentDescription = "phone number",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .padding(8.dp)
            )
            Text(text = number, modifier = Modifier.align(Alignment.CenterVertically))
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.x),
                contentDescription = "linkedIn",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .padding(8.dp)
            )
            Text(text = linkedIn, modifier = Modifier.align(Alignment.CenterVertically))
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.x),
                contentDescription = "email",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .padding(8.dp)
            )
            Text(text = email, modifier = Modifier.align(Alignment.CenterVertically))
        }

    }

}


@Composable
fun Card(
    title: String,
    text: String,
    backgroundColor: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(backgroundColor))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Box(Modifier.fillMaxSize()) {
            Box(modifier = Modifier.align(Alignment.Center)) {
                MainCard(R.drawable.x, "Full Name", "Title")
            }
            Box(modifier = Modifier.align(Alignment.BottomCenter)) {
                Contacts(
                    number = "+00(00) 123-45-67",
                    email = "email@gmail.com",
                    linkedIn = "@myLinkedIn"
                )
            }
        }
    }
}