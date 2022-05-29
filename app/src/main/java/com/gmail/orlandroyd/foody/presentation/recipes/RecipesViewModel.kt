package com.gmail.orlandroyd.foody.presentation.recipes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.gmail.orlandroyd.foody.data.datastore.DataStoreRepository
import com.gmail.orlandroyd.foody.data.datastore.MealAndDietType
import com.gmail.orlandroyd.foody.util.Constants
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_API_KEY
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_DIET
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_NUMBER
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_TYPE
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipesViewModel @Inject constructor(
    application: Application,
    private val dataStoreRepository: DataStoreRepository
) : AndroidViewModel(application) {

    private lateinit var mealAndDiet: MealAndDietType

    val readMealAndDietType = dataStoreRepository.readMealAndDietType

    fun saveMealAndDietType() =
        viewModelScope.launch(Dispatchers.IO) {
            if (this@RecipesViewModel::mealAndDiet.isInitialized) {
                dataStoreRepository.saveMealAndDietType(
                    mealAndDiet.selectedMealType,
                    mealAndDiet.selectedMealTypeId,
                    mealAndDiet.selectedDietType,
                    mealAndDiet.selectedDietTypeId
                )
            }
        }

    fun saveMealAndDietTypeTemp(
        mealType: String,
        mealTypeId: Int,
        dietType: String,
        dietTypeId: Int
    ) {
        mealAndDiet = MealAndDietType(
            mealType,
            mealTypeId,
            dietType,
            dietTypeId
        )
    }

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()
        queries[QUERY_NUMBER] = "50"
        queries[QUERY_API_KEY] = Constants.API_KEY
        queries[QUERY_TYPE] = "snack"
        queries[QUERY_DIET] = "vegan"
        queries[QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"
        return queries
    }

}