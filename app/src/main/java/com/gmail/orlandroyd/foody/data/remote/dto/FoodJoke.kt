package com.gmail.orlandroyd.foody.data.remote.dto


import com.google.gson.annotations.SerializedName

data class FoodJoke(
    @SerializedName("text")
    val text: String
)