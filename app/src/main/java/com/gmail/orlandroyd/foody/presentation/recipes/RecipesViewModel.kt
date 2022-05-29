package com.gmail.orlandroyd.foody.presentation.recipes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.gmail.orlandroyd.foody.util.Constants
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_API_KEY
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_DIET
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_NUMBER
import com.gmail.orlandroyd.foody.util.Constants.Companion.QUERY_TYPE
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipesViewModel @Inject constructor(
    application: Application,
) : AndroidViewModel(application) {

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