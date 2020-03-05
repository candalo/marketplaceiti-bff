package com.github.candalo.marketplaceitibff

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MarketplaceController(private val service: MarketplaceService) {

    @GetMapping("/products")
    fun getProducts() = service.getProducts()

    @GetMapping("/products/{id}")
    fun getProductById(@PathVariable id: String) = service.getProductById(id)

    @GetMapping("/products/orders/status")
    fun getProductsOrdersStatus(@RequestParam state: String) = service.getProductsOrdersStatus(state)

}