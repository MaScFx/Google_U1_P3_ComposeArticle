package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
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
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant() {
    Column {
        Row(Modifier.weight(1f)) {
            Column(
                Modifier
                    .weight(1f)
            ) {
                Card(
                    title = stringResource(R.string.text_composable),
                    text = stringResource(R.string.displays_text_and_follows),
                    backgroundColor = R.color.lila2
                )
            }
            Column(
                Modifier
                    .weight(1f)
            ) {
                Card(
                    title = stringResource(R.string.image_composable),
                    text = stringResource(R.string.creates_a_composable),
                    backgroundColor = R.color.lila3
                )
            }
        }

        Row(Modifier.weight(1f)) {
            Column(
                Modifier
                    .weight(1f)
            ) {
                Card(
                    title = stringResource(R.string.row_composable),
                    text = stringResource(R.string.a_layout_composable),
                    backgroundColor = R.color.lila4
                )
            }
            Column(
                Modifier
                    .weight(1f)
            ) {
                Card(
                    title = stringResource(R.string.column_composable),
                    text = stringResource(R.string.a_layout_composable_2),
                    backgroundColor = R.color.lila1
                )
            }
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
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        ComposeQuadrant()
    }
}