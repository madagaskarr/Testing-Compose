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
import androidx.ui.text.style.TextGeometricTransform
import com.example.testing_compose.models.ImageHeaderModel
import com.example.testing_compose.models.SchedulesModel

@Composable
fun SchedulesComponent(schedulesModel: SchedulesModel) {
    MaterialTheme {
        Surface {
            Center {
                FlowColumn {
                    Text(schedulesModel.title, style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Normal, color = Color.Gray))
                    Text(schedulesModel.hours, style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray))
                    Text(schedulesModel.price, style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray))
                    Text(schedulesModel.type, style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray))
                    Opacity(opacity = 0.3f) {
                        Divider(color = Color.Gray)
                    }

                }
            }

        }
    }

}
