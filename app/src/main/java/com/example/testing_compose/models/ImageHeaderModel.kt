package com.example.testing_compose.models

import androidx.annotation.DrawableRes

data class ImageHeaderModel (

    @DrawableRes val imageResource: Int,
    @DrawableRes val imageResourceIcon: Int,
    val title: String,
    val park: String,
    val land: String
)