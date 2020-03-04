package com.github.candalo.marketplaceitibff.widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class ProductWidget(
        val id: Int,
        val name: String,
        val description: String,
        val value: String
) : Widget()