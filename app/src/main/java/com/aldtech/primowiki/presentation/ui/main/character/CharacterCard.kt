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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CharacterCard() {
    val horizontalGradientBrush = Brush.linearGradient(
        colors = listOf(Color.Blue, Color.Red)
//            start = Offset(0f, Float.POSITIVE_INFINITY),
//            end = Offset(Float.POSITIVE_INFINITY, 0f)
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
            Text(text = "test")
            Text(text = "test")
        }
    }
}