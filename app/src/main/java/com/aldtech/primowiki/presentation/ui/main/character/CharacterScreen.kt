package com.aldtech.primowiki.presentation.ui.main.character

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aldtech.primowiki.presentation.ui.main.Greeting
import com.aldtech.primowiki.presentation.ui.theme.PrimaryText
import com.aldtech.primowiki.presentation.ui.theme.PrimaryWhite
import com.aldtech.primowiki.presentation.ui.theme.PrimoWikiTheme
import com.aldtech.primowiki.presentation.ui.theme.SecondaryWhite
import com.example.primowiki.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterScreen(
    drawerState: DrawerState,
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(PrimaryWhite)
        ) {
            ElementSort()
        }
    }
}

@Composable
fun ElementSort() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            shape = RoundedCornerShape(32.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_anemo),
                        contentDescription = "Anemo"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_geo),
                        contentDescription = "Geo"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_electro),
                        contentDescription = "Electro"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_dendro),
                        contentDescription = "Dendro"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_hydro),
                        contentDescription = "Hydro"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_pyro),
                        contentDescription = "Pyro"
                    )
                }
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_element_cryo),
                        contentDescription = "Cryo"
                    )
                }
            }
        }

        Spacer(
            modifier = Modifier
                .height(16.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Adaptive(100.dp),
            content = {
                items(100) {
                    Text(
                        text = "Item$it",
                        modifier = Modifier.padding(16.dp),
                        color = PrimaryText
                    )
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimoWikiTheme {
        ElementSort()
    }
}