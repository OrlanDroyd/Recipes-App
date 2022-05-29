package com.gmail.orlandroyd.foody.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gmail.orlandroyd.foody.data.remote.dto.ResultDto
import com.gmail.orlandroyd.foody.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: ResultDto,
)