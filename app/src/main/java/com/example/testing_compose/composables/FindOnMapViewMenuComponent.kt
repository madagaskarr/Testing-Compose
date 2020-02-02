package com.example.testing_compose.composables

import android.view.Gravity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.surface.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import com.example.testing_compose.models.FindOnMapViewMenuModel

@Composable
fun FindOnMapViewMenuComponent(findOnMapViewMenuModel: FindOnMapViewMenuModel) {

    MaterialTheme {
        Surface {
            Column(modifier = Spacing(top = 25.dp)) {
                FlexRow {
                    expanded(flex = 1f) {
                        Column {
                            Center {
                                Container(height = 40.dp, width = 40.dp) {
                                    DrawImage(image = +imageResource(findOnMapViewMenuModel.findOnMapImage))
                                }
                            }
                            Center {
                                Text(findOnMapViewMenuModel.findOnMapTitle, style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray))

                            }
                        }
                    }
                    expanded(flex = 1f) {
                        Column {
                            Center {
                                Container(height = 40.dp, width = 40.dp) {
                                    DrawImage(image = +imageResource(findOnMapViewMenuModel.viewMenuImage))
                                }
                            }
                            Center {
                                Text(findOnMapViewMenuModel.viewMenuTitle, style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray))

                            }
                        }
                    }

                }
                Opacity(opacity = 0.3f) {
                    Divider(color = Color.Gray, modifier = Spacing(top = 25.dp))
                }
            }



        }






    }
}
