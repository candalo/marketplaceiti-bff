package com.github.candalo.marketplaceitibff.net

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.github.candalo.marketplaceitibff.models.Product
import com.github.candalo.marketplaceitibff.models.ProductResponse
import com.squareup.okhttp.HttpUrl
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import org.springframework.stereotype.Component

@Component
class Api {

    private val baseUrl = "http://192.168.0.130:8080"
    private val client = OkHttpClient()

    fun fetchProducts(): List<Product> {
        val httpBuilder = HttpUrl.parse(baseUrl)
                .newBuilder()
                .addPathSegment("iti")
                .addPathSegment("products")
                .build()

        val request = Request.Builder()
                .url(httpBuilder)
                .build()

        client.newCall(request).execute().let { response ->
            if (response.isSuccessful) {
                return jacksonObjectMapper().readValue(response?.body()?.string(), ProductResponse::class.java).responseData
            }
            throw IllegalStateException()
        }
    }

    fun fetchProductById(id: String): Product {
        val httpBuilder = HttpUrl.parse(baseUrl)
                .newBuilder()
                .addPathSegment("iti")
                .addPathSegment("product")
                .addPathSegment(id)
                .build()

        val request = Request.Builder()
                .url(httpBuilder)
                .build()

        client.newCall(request).execute().let { response ->
            if (response.isSuccessful) {
                return jacksonObjectMapper().readValue(response?.body()?.string(), Product::class.java)
            }
            throw IllegalStateException()
        }
    }
}