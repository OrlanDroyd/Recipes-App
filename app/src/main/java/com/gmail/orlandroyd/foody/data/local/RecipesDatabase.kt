package com.gmail.orlandroyd.foody.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gmail.orlandroyd.foody.data.local.entities.RecipesEntity

@Database(
    entities = [RecipesEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase : RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

}