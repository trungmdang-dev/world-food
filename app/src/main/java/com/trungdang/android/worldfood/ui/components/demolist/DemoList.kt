package com.trungdang.android.worldfood.ui.components.demolist

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.trungdang.android.worldfood.ui.components.food.FoodItem
import com.trungdang.android.worldfood.data.food.FoodData

@Composable
fun DemoList(foodList: List<FoodData>) {
    Text("Demo list")
    LazyColumn() {
        items(foodList) { food ->
            FoodItem(food)
        }
    }
}