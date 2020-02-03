package com.example.testing_compose.composables

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.sp
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import com.example.testing_compose.models.MenuParagraphModel

//MenuParagraphComponent
@Composable
fun MenuParagraphComponent(menuParagraphModel: MenuParagraphModel) {
    MaterialTheme {
        Surface {
            Column {
                Text(
                    text = menuParagraphModel.text,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.LightGray
                    ),
                    modifier = Spacing(bottom = 8.dp, top = 8.dp, left = 16.dp)
                )
            }

        }
    }
}