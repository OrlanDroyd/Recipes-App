package com.gmail.orlandroyd.foody.data.mapper

import com.gmail.orlandroyd.foody.data.remote.dto.FoodJokeDto
import com.gmail.orlandroyd.foody.domain.model.FoodJoke

fun FoodJokeDto.toFoodJoke(): FoodJoke {
    return FoodJoke(text)
}

fun FoodJoke.toFoodJokeDto(): FoodJoke {
    return FoodJoke(text)
}