package com.gmail.orlandroyd.foody.presentation.favorites

import androidx.test.filters.MediumTest
import com.gmail.orlandroyd.foody.launchFragmentInHiltContainer
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@MediumTest
@HiltAndroidTest
class FavoriteRecipesAdapterTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun testFragmentContainer() {
        launchFragmentInHiltContainer<FavoriteRecipesFragment>() {
        }
    }

}