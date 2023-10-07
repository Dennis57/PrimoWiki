package com.aldtech.primowiki.presentation.ui.main.character

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aldtech.primowiki.presentation.ui.theme.DarkPyro
import com.aldtech.primowiki.presentation.ui.theme.PrimaryWhiteText
import com.aldtech.primowiki.presentation.ui.theme.PrimoWikiTheme

@Composable
fun CharacterCard() {
    val horizontalGradientBrush = Brush.linearGradient(
        colors = listOf(Color.Black, DarkPyro),
        start = Offset(50f, -100f),
        end = Offset(300f, 100f)
    )
    Card(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = horizontalGradientBrush),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "test", color = PrimaryWhiteText)
            Text(text = "test", color = PrimaryWhiteText)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CharacterCardPreview() {
    PrimoWikiTheme {
        CharacterCard()
    }
}