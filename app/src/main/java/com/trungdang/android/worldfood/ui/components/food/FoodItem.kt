package com.trungdang.android.worldfood.ui.components.food

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.trungdang.android.worldfood.data.food.FoodData

@Composable
fun FoodItem(foodData: FoodData) {
    Text("A food item: ${foodData.name}")
}