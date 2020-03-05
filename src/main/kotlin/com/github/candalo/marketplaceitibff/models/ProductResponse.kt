package com.github.candalo.marketplaceitibff.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProductResponse(val responseData: List<Product>)