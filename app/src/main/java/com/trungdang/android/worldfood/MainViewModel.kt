package com.trungdang.android.worldfood

import androidx.lifecycle.ViewModel
import com.trungdang.android.worldfood.data.food.FoodData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel: ViewModel() {

    private val _foodList: MutableStateFlow<List<FoodData>> = MutableStateFlow(listOf())
    val foodList: StateFlow<List<FoodData>> = _foodList

    fun fetchFoodList() {
        Thread.sleep(100)
        _foodList.value = testFoodList
    }

    companion object {
        private val testFoodList = listOf(
            FoodData("Pho"),
            FoodData("Broken Rice"),
            FoodData("Rice Vermicelli Bowl"),
            FoodData("Sizzling Crepe")
        )
    }

}