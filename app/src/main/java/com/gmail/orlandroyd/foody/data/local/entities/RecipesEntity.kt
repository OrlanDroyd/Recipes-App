package com.gmail.orlandroyd.foody.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gmail.orlandroyd.foody.data.remote.dto.FoodRecipeDto
import com.gmail.orlandroyd.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipeDto
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}