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
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextGeometricTransform
import com.example.testing_compose.models.ImageHeaderModel
import com.example.testing_compose.models.SchedulesModel

@Composable
fun SchedulesComponent(schedulesModel: SchedulesModel) {
    MaterialTheme {
        Surface {
            Column {
                Center {
                    Text(text = schedulesModel.title, style = TextStyle(fontSize = 18.sp, color = Color.LightGray), modifier = Spacing(top = 13.dp))
                }

                Center {
                    Text(text = schedulesModel.hours, style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
                }

                Center {
                    Text(text = schedulesModel.price, style = TextStyle(fontSize = 15.sp))
                }

                Center {
                    Text(text = schedulesModel.type, style = TextStyle(fontSize = 12.sp), modifier = Spacing(bottom = 13.dp))
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

