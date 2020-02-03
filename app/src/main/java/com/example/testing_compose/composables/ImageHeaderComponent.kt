package com.example.testing_compose.composables

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Row
import androidx.ui.layout.Spacing
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import com.example.testing_compose.models.ImageHeaderModel

@Composable
fun ImageHeaderComponent(imageHeaderModel: ImageHeaderModel) {

    MaterialTheme {
        Surface {
            Column {
                Container(expanded = true, height = 220.dp, alignment = Alignment.Center, modifier = Spacing(bottom = 16.dp)) {
                    DrawImage(image = +imageResource(imageHeaderModel.imageResource))
                }
                Row {
                    Container(expanded = true, height = 28.dp, width = 25.dp, modifier = Spacing(left = 16.dp, top = 7.dp)) {
                        DrawImage(image = +imageResource(imageHeaderModel.imageResourceIcon))
                    }
                    Text(imageHeaderModel.title, style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray), modifier = Spacing(left = 15.dp))
                }
                Text(
                    imageHeaderModel.park,
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.DarkGray),
                    modifier = Spacing(left = 56.dp, bottom = 2.dp)
                )
                Text(
                    imageHeaderModel.land,
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.DarkGray),
                    modifier = Spacing(left = 56.dp, bottom = 16.dp))
                Opacity(opacity = 0.3f) {
                    Divider(color = Color.Gray)
                }
            }
        }
    }
}
