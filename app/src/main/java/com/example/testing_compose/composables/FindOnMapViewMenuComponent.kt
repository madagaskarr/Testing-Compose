package com.example.testing_compose.composables

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import com.example.testing_compose.models.FindOnMapViewMenuModel

@Composable
fun FindOnMapViewMenuComponent(findOnMapViewMenuModel: FindOnMapViewMenuModel) {

    MaterialTheme {
        Surface {

            Column {
                Row {
                    Column(modifier = Spacing(left = 60.dp, top = 25.dp, bottom = 25.dp)) {
                        Container(expanded = true, height = 50.dp, width = 50.dp, modifier = Spacing(left = 16.dp, top = 7.dp)) {
                            DrawImage(image = +imageResource(findOnMapViewMenuModel.findOnMapImage))
                        }
                        Text(findOnMapViewMenuModel.findOnMapTitle, style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray), modifier = Spacing(left = 5.dp, top = 8.dp))
                    }

                    Column(modifier = Spacing(left = 90.dp, top = 25.dp, bottom = 30.dp)) {
                        Container(expanded = true, height = 50.dp, width = 50.dp, modifier = Spacing(left = 16.dp, top = 7.dp)) {
                            DrawImage(image = +imageResource(findOnMapViewMenuModel.viewMenuImage))
                        }
                        Text(findOnMapViewMenuModel.viewMenuTitle, style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray), modifier = Spacing(left = 10.dp, top = 8.dp))
                    }
                }
                Opacity(opacity = 0.3f) {
                    Divider(color = Color.Gray)
                }
            }
        }


    }
}