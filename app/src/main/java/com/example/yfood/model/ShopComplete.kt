package com.example.yfood.model

data class ShopComplete(
    val id: Int,
    val url: String,
    val description: String,
    val rate: Double,
    val category: String,
    val distance: Double,
    val time: String,
    val price: Double
) {
}