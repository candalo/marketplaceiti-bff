package com.github.candalo.marketplaceitibff.widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class CartProductWidget(
        val imageUrl: String,
        val productName: String,
        val productNameColor: String,
        val productNameSize: Int,
        val productPrice: String,
        val productPriceColor: String,
        val productPriceSize: Int
) : Widget()