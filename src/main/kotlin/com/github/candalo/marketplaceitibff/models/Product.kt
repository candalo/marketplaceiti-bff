package com.github.candalo.marketplaceitibff.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Product(
        val id: String,
        val sku: String,
        val name: String,
        val shortDescription: String,
        val longDescription: String,
        val imageUrl: String,
        val price: Price
)