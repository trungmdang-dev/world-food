package com.trungdang.android.worldfood

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Set the status bar and navigation bar like YouTube app.
        when (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
            Configuration.UI_MODE_NIGHT_YES -> {
                setTheme(R.style.Theme_WorldFoodDark)
            }
            Configuration.UI_MODE_NIGHT_NO -> {
                setTheme(R.style.Theme_WorldFoodLight)
                val controller: WindowInsetsControllerCompat = WindowCompat.getInsetsController(window, window.decorView)
                controller.apply {
                    isAppearanceLightNavigationBars = true
                    isAppearanceLightStatusBars = true
                }
            }
        }

        val appContainer = (application as WorldFoodApplication).appContainer
        setContent {
            WorldFoodApp(appContainer = appContainer)
        }
    }
}