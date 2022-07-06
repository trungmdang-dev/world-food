package com.trungdang.android.worldfood.data.food


interface FoodRepository {

    fun getFood(name: String): FoodData

}