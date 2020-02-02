package com.example.testing_compose.composables

import androidx.compose.Composable
import androidx.ui.core.Opacity
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.sp
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import com.example.testing_compose.models.MenuCategoryTitleModel
import com.example.testing_compose.models.ParagraphComponentModel

@Composable
fun MenuCategoryTitleComponent(menuCategoryTitleModel: MenuCategoryTitleModel) {
    MaterialTheme {
        Surface {
            Column {
                Text(
                    text = menuCategoryTitleModel.title,
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.Gray),
                    modifier = Spacing(bottom = 18.dp, top = 16.dp, left = 16.dp)
                )

                Opacity(opacity = 0.3f) {
                    Divider(color = Color.Gray)
                }
            }

        }
    }

}
