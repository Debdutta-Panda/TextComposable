package com.debduttapanda.textcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.debduttapanda.textcomposable.ui.theme.TextComposableTheme

class MainActivity : ComponentActivity() {
    private val fontFamily = FontFamily(
        Font(R.font.exo2regular, weight = FontWeight.Normal),
        Font(R.font.exo2italic, weight = FontWeight.Normal, style = FontStyle.Italic),
        Font(R.font.exo2bold, weight = FontWeight.Bold),
        Font(R.font.exo2bolditalic, weight = FontWeight.Bold, style = FontStyle.Italic),
    )
    private val textStyle = TextStyle(
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        fontFamily = fontFamily,
        textDecoration = TextDecoration.Underline
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(){
                        LazyColumn(){
                            item{
                                Text("Hello World(scroll to bottom)")
                            }
                            item{
                                Text(
                                    "Big Text",
                                    fontSize = 48.sp
                                )
                            }
                            item{
                                Text(
                                    "Cursive Font",
                                    fontFamily = FontFamily.Cursive
                                )
                            }
                            item{
                                Text(
                                    "Custom Font",
                                    fontFamily = fontFamily
                                )
                            }
                            item{
                                Text(
                                    "Red Text",
                                    color = Color.Red
                                )
                            }
                            item{
                                Text(
                                    "Text Background",
                                    style = TextStyle(
                                        background = Color.Red
                                    )
                                )
                            }
                            item{
                                Text(
                                    "Green Text",
                                    color = Color.Green
                                )
                            }
                            item{
                                Text(
                                    "Blue Text",
                                    color = Color.Blue
                                )
                            }
                            item{
                                Text(
                                    "Custom color Text",
                                    color = Color(0xfffca903)
                                )
                            }
                            item{
                                Text(
                                    "Bold Text",
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            item{
                                Text(
                                    "Italic Text",
                                    fontStyle = FontStyle.Italic
                                )
                            }
                            item{
                                Text(
                                    "Bold Italic Text",
                                    fontWeight = FontWeight.Bold,
                                    fontStyle = FontStyle.Italic
                                )
                            }
                            item{
                                Text(
                                    "Letter Spacing",
                                    letterSpacing = 24.sp
                                )
                            }
                            item{
                                Text(
                                    "Underlined Text",
                                    textDecoration = TextDecoration.Underline
                                )
                            }
                            item{
                                Text(
                                    "LineThrough Text",
                                    textDecoration = TextDecoration.LineThrough
                                )
                            }
                            item{
                                Text(
                                    "LineThrough and Underlined Text",
                                    textDecoration = TextDecoration.combine(
                                        listOf(
                                            TextDecoration.LineThrough,
                                            TextDecoration.Underline,
                                        )
                                    )
                                )
                            }
                            item{
                                Text(
                                    "Left Align",
                                    textAlign = TextAlign.Left
                                )
                            }
                            item{
                                Text(
                                    "Right Align, need more text to understand, so let's put some more",
                                    textAlign = TextAlign.Right
                                )
                            }
                            item{
                                Text(
                                    "Center Align, need more text to understand, so let's put some more",
                                    textAlign = TextAlign.Center
                                )
                            }
                            item{
                                Divider()
                            }
                            item{
                                Text(
                                    "Justified, need more text to understand, so let's put some more. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                                    textAlign = TextAlign.Justify
                                )
                            }
                            item{
                                Divider()
                            }
                            item{
                                Text(
                                    "Soft wrap, need more text to understand, so let's put some more. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                                    softWrap = false
                                )
                            }
                            item{
                                Text(
                                    "Line height will be more if you set it properly. Let's have some more text",
                                    lineHeight = 40.sp
                                )
                            }
                            item{
                                Text(
                                    "Indentation, need more text to understand, so let's put some more. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                                    style = TextStyle(
                                        textIndent = TextIndent(
                                            firstLine = 40.sp,
                                            restLine = 10.sp
                                        )
                                    )
                                )
                            }
                            item{
                                Text(
                                    "Shadow",
                                    fontSize = 48.sp,
                                    style = TextStyle(
                                        shadow = Shadow(
                                            Color.Red,
                                            offset = Offset(12f,12f),
                                            blurRadius = 12f
                                        )
                                    )
                                )
                            }
                            item{
                                Text(
                                    "Overflow with ellipsis, need more text to understand, so let's put some more. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = 1
                                )
                            }
                            item{
                                Text(
                                    "Text Style",
                                    style = textStyle
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
