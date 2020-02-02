package com.example.testing_compose.composables

import android.content.Intent
import android.widget.Toast
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import com.example.testing_compose.MenuActivity
import com.example.testing_compose.models.MenuItemModel

@Composable
fun MenuItemComponent(menuItemModel: MenuItemModel) {
    MaterialTheme {
        Surface {
            Column(modifier = Spacing(top = 15.dp)) {
                FlexRow {
                    expanded(flex = 0.7f) {
                        Column {
                            Text(menuItemModel.title, style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray), modifier = Spacing(left = 16.dp, bottom = 12.dp))

                            Text(menuItemModel.ingridients, style = TextStyle(fontSize = 11.sp, fontWeight = FontWeight.Normal, color = Color.LightGray), modifier = Spacing(left = 16.dp))

                        }
                    }

                    expanded(flex = 0.3f) {
                        Column {
                            Align(alignment = Alignment.TopRight) {
                                Text(menuItemModel.price, style = TextStyle(fontSize = 13.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray), modifier = Spacing(right = 16.dp))
                            }

                        }
                    }

                }
                Opacity(opacity = 0.3f) {
                    Divider(color = Color.Gray, modifier = Spacing(top = 15.dp))
                }
            }



        }
    }
}
