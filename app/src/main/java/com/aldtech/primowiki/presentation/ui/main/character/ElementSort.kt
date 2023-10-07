package com.aldtech.primowiki.presentation.ui.main.character

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.primowiki.R

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