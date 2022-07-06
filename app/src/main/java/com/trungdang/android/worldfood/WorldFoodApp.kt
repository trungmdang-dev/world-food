package com.trungdang.android.worldfood

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.trungdang.android.favoritefood.ui.components.demoinfo.DemoInfo
import com.trungdang.android.worldfood.ui.components.demolist.DemoList
import com.trungdang.android.worldfood.ui.components.video.VideoPlayer
import com.trungdang.android.worldfood.data.AppContainer
import com.trungdang.android.worldfood.ui.theme.WorldFoodTheme

@Composable
fun WorldFoodApp(
    appContainer: AppContainer
) {
    WorldFoodTheme {
        Column {
            VideoPlayer()
            DemoInfo()
            DemoList(listOf())
        }
    }
}