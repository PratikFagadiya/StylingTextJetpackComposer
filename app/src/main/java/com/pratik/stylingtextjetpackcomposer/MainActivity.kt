package com.pratik.stylingtextjetpackcomposer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pratik.stylingtextjetpackcomposer.ui.theme.*

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(
                modifier = Modifier.padding(start = 25.dp, top = 25.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(modifier = Modifier.padding(start = 25.dp, top = 25.dp)) {
                    StylingText()
                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StylingText() {
    Text(
        modifier = Modifier.padding(start = 10.dp, top = 25.dp),
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Purple500,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Black
                )
            ) {
                append("H")
            }
            append("ello ")
            withStyle(
                style = SpanStyle(
                    color = Purple500,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Black
                )
            ) {
                append("D")
            }
            append("eveloper")
        },
        color = BLACK,
        fontSize = 25.sp,
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center
    )
}
