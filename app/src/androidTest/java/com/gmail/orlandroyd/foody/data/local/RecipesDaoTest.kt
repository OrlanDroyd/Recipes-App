package com.gmail.orlandroyd.foody.data.local

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.filters.SmallTest
import com.gmail.orlandroyd.foody.data.local.entities.FavoritesEntity
import com.gmail.orlandroyd.foody.data.local.entities.RecipesEntity
import com.gmail.orlandroyd.foody.data.remote.dto.FoodRecipeDto
import com.gmail.orlandroyd.foody.data.remote.dto.ResultDto
import com.google.common.truth.Truth.assertThat
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import javax.inject.Named

@OptIn(ExperimentalCoroutinesApi::class)
@HiltAndroidTest
@SmallTest
class RecipesDaoTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Inject
    @Named("test_db")
    lateinit var database: RecipesDatabase
    private lateinit var dao: RecipesDao

    @Before
    fun setup() {
        hiltRule.inject()
        dao = database.recipesDao()
    }

    @After
    fun teardown() {
        database.close()
    }

    @Test
    fun insertRecipeItem() = runTest {

        val recipeItem = RecipesEntity(
            FoodRecipeDto(results = listOf())
        )

        dao.insertRecipes(recipeItem)

        val allRecipesItems = dao.readRecipes().first()

        assertThat(allRecipesItems).isNotEmpty()

    }

    @Test
    fun insertFavoriteRecipeItem() = runTest {

        val favoriteRecipeItem = FavoritesEntity(
            id = 0, result = ResultDto(aggregateLikes = 0,
                cheap = false,
                dairyFree = false,
                extendedIngredients = listOf(),
                glutenFree = false,
                recipeId = 0,
                image = null,
                readyInMinutes = 0,
                sourceName = null,
                sourceUrl = "",
                summary = "",
                title = "",
                vegan = false,
                vegetarian = false,
                veryHealthy = false)
        )

        dao.insertFavoriteRecipe(favoriteRecipeItem)

        val allFavoriteRecipesItems = dao.readFavoriteRecipes().first()

        assertThat(allFavoriteRecipesItems).isNotEmpty()

    }

}