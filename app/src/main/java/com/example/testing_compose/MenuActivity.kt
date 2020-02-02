package com.example.testing_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Context
import androidx.ui.core.setContent
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import com.example.testing_compose.composables.*
import com.example.testing_compose.models.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { maenuActivityContents(this) }
    }

    @Composable
    fun maenuActivityContents(context: Context) {

       var menuCategoryTitleModel = MenuCategoryTitleModel("Snacks")
       var menuActivityTitleModel = MenuActivityTitleModel("Menu")
       var menuItemModelOne = MenuItemModel("Spiced Vegetable Bao", "Chikpeas, Chickpeas Vegetables", "$5.99")

        VerticalScroller {
            Column {
                MenuActivityTitleComponent(menuActivityTitleModel = menuActivityTitleModel)
                MenuCategoryTitleComponent(menuCategoryTitleModel = menuCategoryTitleModel)
                MenuItemComponent(menuItemModel = menuItemModelOne)
            }
        }
    }
}