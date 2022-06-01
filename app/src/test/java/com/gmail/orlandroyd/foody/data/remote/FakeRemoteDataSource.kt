package com.gmail.orlandroyd.foody.data.remote

import com.gmail.orlandroyd.foody.data.remote.dto.FoodRecipeDto
import kotlinx.coroutines.flow.MutableStateFlow

class FakeRemoteDataSource {

    private val recipesItems = mutableListOf<FoodRecipeDto>()
    private val observableRecipesItems = MutableStateFlow<List<FoodRecipeDto>>(recipesItems)

    private var shouldReturnNetworkError = false

    fun setShouldReturnNetworkError(value: Boolean) {
        shouldReturnNetworkError = value
    }

    suspend fun getRecipes(): List<FoodRecipeDto> {
        return recipesItems
    }

}