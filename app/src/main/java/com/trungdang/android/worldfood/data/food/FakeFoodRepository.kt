package com.trungdang.android.worldfood.data.food


class FakeFoodRepository: FoodRepository {

    override fun getFood(name: String): FoodData {
        Thread.sleep(50)
        return FoodData("A food name")
    }
}