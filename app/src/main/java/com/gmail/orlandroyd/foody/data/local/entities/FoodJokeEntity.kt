package com.gmail.orlandroyd.foody.data.local.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gmail.orlandroyd.foody.data.remote.dto.FoodJokeDto
import com.gmail.orlandroyd.foody.util.Constants.Companion.FOOD_JOKE_TABLE

@Entity(tableName = FOOD_JOKE_TABLE)
class FoodJokeEntity(
    @Embedded
    var foodJoke: FoodJokeDto,
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}