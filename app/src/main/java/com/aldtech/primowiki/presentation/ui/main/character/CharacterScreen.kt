package com.aldtech.primowiki.presentation.ui.main.character

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aldtech.primowiki.presentation.ui.theme.PrimaryWhite
import com.aldtech.primowiki.presentation.ui.theme.PrimoWikiTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterScreen(
    drawerState: DrawerState,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryWhite)
    ) {
        ElementSort()

        Spacer(
            modifier = Modifier
                .height(16.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Adaptive(100.dp),
            content = {
                items(100) {
//                    Text(
//                        text = "Item$it",
//                        modifier = Modifier.padding(16.dp),
//                        color = PrimaryText
//                    )
                    CharacterCard()
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ElementSortPreview() {
    PrimoWikiTheme {
        ElementSort()
    }
}