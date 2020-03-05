package com.github.candalo.marketplaceitibff.widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class ProductDetailsWidget(
        val productWidget: ProductWidget,
        val productControlWidget: ProductControlWidget
) : Widget()