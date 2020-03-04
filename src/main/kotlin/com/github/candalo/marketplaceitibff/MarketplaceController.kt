package com.github.candalo.marketplaceitibff

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MarketplaceController(private val service: MarketplaceService) {

    @GetMapping("/products")
    fun getProducts() = service.getProducts()

}