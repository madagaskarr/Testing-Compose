package com.example.testing_compose.models

import androidx.annotation.DrawableRes

data class FindOnMapViewMenuModel (
    @DrawableRes val findOnMapImage: Int,
    @DrawableRes val viewMenuImage: Int,
    val findOnMapTitle: String,
    val viewMenuTitle: String
)

