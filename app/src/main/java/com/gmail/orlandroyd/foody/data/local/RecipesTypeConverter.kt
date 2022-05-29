package com.gmail.orlandroyd.foody.data.local

import androidx.room.TypeConverter
import com.gmail.orlandroyd.foody.data.remote.dto.FoodRecipeDto
import com.gmail.orlandroyd.foody.data.remote.dto.ResultDto
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class RecipesTypeConverter {

    var gson = Gson()

    @TypeConverter
    fun foodRecipeToString(foodRecipe: FoodRecipeDto): String {
        return gson.toJson(foodRecipe)
    }

    @TypeConverter
    fun stringToFoodRecipe(data: String): FoodRecipeDto {
        val listType = object : TypeToken<FoodRecipeDto>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun resultToString(result: ResultDto): String {
        return gson.toJson(result)
    }

    @TypeConverter
    fun stringToResult(data: String): ResultDto {
        val listType = object : TypeToken<ResultDto>() {}.type
        return gson.fromJson(data, listType)
    }

}