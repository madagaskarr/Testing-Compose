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

class MainActivity : AppCompatActivity() {

    private lateinit var applicationComponents: Map<String, Any>
    private lateinit var applicationData: List<Any>
    private lateinit var parcedList: MutableMap<Any, Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Create LiveData and a parser for generic list of application components

        applicationComponents = mapOf(
            "ImageHeaderModel" to ImageHeaderModel::class.java,
            "FindOnMapViewMenuModel" to FindOnMapViewMenuModel::class.java,
            "SchedulesModel" to SchedulesModel::class.java,
            "DiningExperienceModel" to DiningExperienceModel::class.java,
            "TypeOfCuisineModel" to TypeOfCuisineModel::class.java,
            "ParagraphComponentModel" to ParagraphComponentModel::class.java
        )

        parcedList = mutableMapOf()

        var imageHeader = ImageHeaderModel(R.drawable.header_image, R.drawable.baseline_restaurant_black_18dp,"The Tropical Hideway", "Disneyland Park", "Adventureland")
        var findOnMapViewMenu = FindOnMapViewMenuModel(R.drawable.find_on_map, R.drawable.view_menu, "Find on Map", "View Menu")
        var schedules = SchedulesModel("Snack", "10:00 AM to 11:00 PM", "$14.99 and under per adult", "Quick Service Restaurant")
        var diningExperience = DiningExperienceModel("Dining Experience", "Quick Service")
        var typeOfSCuisine = TypeOfCuisineModel("Type of Cuisine","Vegeterian")
        var parapgraph = ParagraphComponentModel("Escape to an amazing jungle oasis offering fast n easy fare with a sense of adventure in the air!",
            "An Outpost for All","Explore the wilds of the park, then kick back and enjoy delish dishes amidsts this lush , trader's market")

        applicationData = listOf(imageHeader, findOnMapViewMenu, schedules, diningExperience, typeOfSCuisine, parapgraph)

        setContent {
            mainActivityContent(this, applicationData)
        }
    }

    @Composable
    fun mainActivityContent(context: Context, applicationData: List<Any> ) {

        VerticalScroller {
            Column {
                for (component in applicationData) {
                    if (component is ImageHeaderModel) {
                        ImageHeaderComponent(imageHeaderModel = component)
                    } else if (component is FindOnMapViewMenuModel) {
                        FindOnMapViewMenuComponent(findOnMapViewMenuModel = component, context = context)
                    } else if (component is SchedulesModel) {
                        SchedulesComponent(schedulesModel = component)
                    } else if (component is DiningExperienceModel) {
                        DiningExperienceComponent(diningExperienceModel = component)
                    } else if (component is TypeOfCuisineModel) {
                        TypeOfCuisineComponent(typeOfCuisineModel = component)
                    } else if (component is ParagraphComponentModel) {
                        ParagraphComponentComponent(paragraphComponentModel = component)
                    }
                }
            }
        }
    }
}