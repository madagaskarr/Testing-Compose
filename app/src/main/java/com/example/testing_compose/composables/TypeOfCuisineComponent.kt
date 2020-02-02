package com.example.testing_compose.composables

import androidx.compose.Composable
import androidx.ui.core.Opacity
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.sp
import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import com.example.testing_compose.models.SchedulesModel
import com.example.testing_compose.models.TypeOfCuisineModel

//TypeOfCuisine

@Composable
fun TypeOfCuisineComponent(typeOfCuisineModel: TypeOfCuisineModel) {
    MaterialTheme {
        Surface {
            Column {
                Center {
                    Text(
                        text = typeOfCuisineModel.title,
                        style = TextStyle(fontSize = 14.sp, color = Color.LightGray),
                        modifier = Spacing(top = 13.dp)
                    )
                }

                Center {
                    Text(
                        text = typeOfCuisineModel.type,
                        style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold),
                        modifier = Spacing(bottom = 13.dp, top = 8.dp)
                    )
                }
                Center {
                    Opacity(opacity = 0.3f) {
                        Divider(color = Color.Gray)
                    }
                }
            }

        }
    }

}

