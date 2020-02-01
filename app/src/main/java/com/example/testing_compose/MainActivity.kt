package com.example.testing_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.ScrollerPosition
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.tooling.preview.Preview
import com.example.testing_compose.composables.FindOnMapViewMenuComponent
import com.example.testing_compose.composables.ImageHeaderComponent
import com.example.testing_compose.composables.SchedulesComponent
import com.example.testing_compose.models.FindOnMapViewMenuModel
import com.example.testing_compose.models.ImageHeaderModel
import com.example.testing_compose.models.SchedulesModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var imageHeader = ImageHeaderModel(R.drawable.header_image, R.drawable.baseline_restaurant_black_18dp,"The Tropical Hideway", "Disneyland Park", "Adventureland")
        var findOnMapViewMenu = FindOnMapViewMenuModel(R.drawable.find_on_map, R.drawable.view_menu, "Find on Map", "View Menu")
        var schedules = SchedulesModel("Snack", "10:00 AM to 11:00 PM", "$14.99 and under per adult", "Quick Service Restaurant")

        setContent {
            VerticalScroller {
                Column {
                    ImageHeaderComponent(imageHeaderModel = imageHeader)
                    FindOnMapViewMenuComponent(findOnMapViewMenuModel = findOnMapViewMenu)
                    SchedulesComponent(schedulesModel = schedules)
                }
            }
        }






    }

}