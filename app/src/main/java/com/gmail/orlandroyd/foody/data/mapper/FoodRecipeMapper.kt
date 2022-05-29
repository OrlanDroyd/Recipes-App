package com.gmail.orlandroyd.foody.data.mapper

import com.gmail.orlandroyd.foody.data.remote.dto.FoodRecipeDto
import com.gmail.orlandroyd.foody.domain.model.FoodRecipe

fun FoodRecipeDto.toFoodRecipe(): FoodRecipe {
    return FoodRecipe(results.map { it.toResult() })
}

fun FoodRecipe.toFoodRecipeDto(): FoodRecipeDto {
    return FoodRecipeDto(results.map { it.toResultDto() })
}