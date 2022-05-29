package com.gmail.orlandroyd.foody.data.remote

import com.gmail.orlandroyd.foody.data.remote.dto.FoodJokeDto
import com.gmail.orlandroyd.foody.data.remote.dto.FoodRecipeDto
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipeDto> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipes(searchQuery: Map<String, String>): Response<FoodRecipeDto> {
        return foodRecipesApi.searchRecipes(searchQuery)
    }

    suspend fun getFoodJoke(apiKey: String): Response<FoodJokeDto> {
        return foodRecipesApi.getFoodJoke(apiKey)
    }

}