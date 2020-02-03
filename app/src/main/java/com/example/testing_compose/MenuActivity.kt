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

       var menuActivityTitleModel = MenuActivityTitleModel("Menu")
       var menuCategoryTitleModel = MenuCategoryTitleModel("Snacks")
       var menuItemModelOne = MenuItemModel("Spiced Vegetable Bao", "Chikpeas, Chickpeas Vegetables", "$5.99")
       var menuItemModelTwo = MenuItemModel("Lime Chicken Bao", "Butternut Squash, Fresh Herbs", "$7.99")
       var menuItemModelThree = MenuItemModel("Bulgog Beef Bao", "Sweet Chilies, Potatoes", "$11.99")
       var menuItemModelFour = MenuItemModel("Traditional Pork Lumpia", "Pork, Vegetables, Sweet-Chili Dipping Sauce", "$5.99")
       var menuItemModelFive = MenuItemModel("Bag of Chips", "Potatoes", "$2.99")
       var menuCategoryTitleModelTwo = MenuCategoryTitleModel("Desserts")
       var menuItemModelSix = MenuItemModel("Sweet Lumpia", "Cream Cheese, Pineapple, DOLL Pineaple Dipping Sauce", "$6.99")
       var menuCategoryTitleModelThree = MenuCategoryTitleModel("Loaded Whips")
       var menuItemModelSeven = MenuItemModel("Orange-Pineapple Swirl Whip", "Exotic Fruit, Crystallized Hibiscus", "$7.99")
       var menuParagraphModelOne = MenuParagraphModel("Menu items and prices are subject to change without notice.")
       var menuParagraphModelTwo = MenuParagraphModel("Consuming raw or undercooked meats, seafood, shellfish or eggs may increase your risk of food borne ilness.")


        VerticalScroller {
            Column {
                MenuActivityTitleComponent(menuActivityTitleModel = menuActivityTitleModel)
                MenuCategoryTitleComponent(menuCategoryTitleModel = menuCategoryTitleModel)
                MenuItemComponent(menuItemModel = menuItemModelOne)
                MenuItemComponent(menuItemModel = menuItemModelTwo)
                MenuItemComponent(menuItemModel = menuItemModelThree)
                MenuItemComponent(menuItemModel = menuItemModelFour)
                MenuItemComponent(menuItemModel = menuItemModelFive)
                MenuCategoryTitleComponent(menuCategoryTitleModel = menuCategoryTitleModelTwo)
                MenuItemComponent(menuItemModel = menuItemModelSix)
                MenuCategoryTitleComponent(menuCategoryTitleModel = menuCategoryTitleModelThree)
                MenuItemComponent(menuItemModel = menuItemModelSeven)
                MenuParagraphComponent(menuParagraphModel = menuParagraphModelOne)
                MenuParagraphComponent(menuParagraphModel = menuParagraphModelTwo)

            }
        }
    }
}