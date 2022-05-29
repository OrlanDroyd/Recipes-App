package com.gmail.orlandroyd.foody.data.mapper

import com.gmail.orlandroyd.foody.data.remote.dto.ResultDto
import com.gmail.orlandroyd.foody.domain.model.Result

fun ResultDto.toResult(): Result {
    return Result(
        aggregateLikes,
        cheap,
        dairyFree,
        extendedIngredients.map { it.toExtendedIngredient() },
        glutenFree,
        recipeId,
        image,
        readyInMinutes,
        sourceName,
        sourceUrl,
        summary,
        title,
        vegan,
        vegetarian,
        veryHealthy
    )
}

fun Result.toResultDto(): ResultDto {
    return ResultDto(
        aggregateLikes,
        cheap,
        dairyFree,
        extendedIngredients.map { it.toExtendedIngredientDto() },
        glutenFree,
        recipeId,
        image,
        readyInMinutes,
        sourceName,
        sourceUrl,
        summary,
        title,
        vegan,
        vegetarian,
        veryHealthy
    )
}