package com.gmail.orlandroyd.foody.di

import android.app.Application
import androidx.room.Room
import com.gmail.orlandroyd.foody.data.local.RecipesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {

    @Provides
    @Singleton
    @Named("test_db")
    fun provideRecipesDatabase(app: Application): RecipesDatabase {
        return Room.inMemoryDatabaseBuilder(
            app,
            RecipesDatabase::class.java
        ).build()
    }

}