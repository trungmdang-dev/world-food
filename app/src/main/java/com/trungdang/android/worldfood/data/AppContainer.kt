package com.trungdang.android.worldfood.data

import android.content.Context
import com.trungdang.android.worldfood.data.food.FakeFoodRepository
import com.trungdang.android.worldfood.data.food.FoodRepository

interface AppContainer {
    val foodRepository: FoodRepository
}

class AppContainerImpl(private val appContext: Context): AppContainer {

    override val foodRepository: FoodRepository by lazy {
        FakeFoodRepository()
    }
}