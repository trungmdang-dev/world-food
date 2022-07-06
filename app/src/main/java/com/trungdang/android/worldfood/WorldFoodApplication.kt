package com.trungdang.android.worldfood

import android.app.Application
import com.trungdang.android.worldfood.data.AppContainer
import com.trungdang.android.worldfood.data.AppContainerImpl

class WorldFoodApplication: Application() {

    lateinit var appContainer: AppContainer

    override fun onCreate() {
        super.onCreate()
        appContainer = AppContainerImpl(this)
    }
}