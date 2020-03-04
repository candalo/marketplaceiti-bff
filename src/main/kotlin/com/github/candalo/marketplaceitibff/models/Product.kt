package com.github.candalo.marketplaceitibff.models

data class Product(
        val id: Int,
        val sku: String,
        val shortDescription: String,
        val longDescription: String,
        val imageUrl: String,
        val price: Price
)