package com.aldtech.primowiki.presentation.ui.main.character

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aldtech.primowiki.presentation.ui.theme.PrimaryWhite
import com.aldtech.primowiki.presentation.ui.theme.PrimoWikiTheme
import com.example.primowiki.R

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

@Composable
fun ElementSort() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            shape = RoundedCornerShape(32.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(0.dp)
                        .defaultMinSize(1.dp, 1.dp)
                ) {
                    Image(
                        modifier = Modifier.clickable {
                            /*TODO*/
                        },
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_anemo),
                        contentDescription = "Anemo"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(0.dp)
                        .defaultMinSize(1.dp, 1.dp)
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_geo),
                        contentDescription = "Geo"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(0.dp)
                        .defaultMinSize(1.dp, 1.dp)
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_electro),
                        contentDescription = "Electro"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(0.dp)
                        .defaultMinSize(1.dp, 1.dp)
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_dendro),
                        contentDescription = "Dendro"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(0.dp)
                        .defaultMinSize(1.dp, 1.dp)
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_hydro),
                        contentDescription = "Hydro"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(0.dp)
                        .defaultMinSize(1.dp, 1.dp)
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_pyro),
                        contentDescription = "Pyro"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(0.dp)
                        .defaultMinSize(1.dp, 1.dp)
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_cryo),
                        contentDescription = "Cryo"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElementSortPreview() {
    PrimoWikiTheme {
        ElementSort()
    }
}

@Preview(showBackground = true)
@Composable
fun CharacterCardPreview() {
    PrimoWikiTheme {
        val horizontalGradientBrush = Brush.linearGradient(
            colors = listOf(Blue, Red)
//            start = Offset(0f, Float.POSITIVE_INFINITY),
//            end = Offset(Float.POSITIVE_INFINITY, 0f)
        )
        Card(
            modifier = Modifier
                .width(100.dp)
                .height(100.dp),
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
}