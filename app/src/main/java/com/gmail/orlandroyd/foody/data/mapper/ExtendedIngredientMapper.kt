package com.gmail.orlandroyd.foody.data.mapper

import com.gmail.orlandroyd.foody.data.remote.dto.ExtendedIngredientDto
import com.gmail.orlandroyd.foody.domain.model.ExtendedIngredient

fun ExtendedIngredientDto.toExtendedIngredient(): ExtendedIngredient {
    return ExtendedIngredient(
        amount,
        consistency,
        image,
        name,
        original,
        unit
    )
}

fun ExtendedIngredient.toExtendedIngredientDto(): ExtendedIngredientDto {
    return ExtendedIngredientDto(
        amount,
        consistency,
        image,
        name,
        original,
        unit
    )
}