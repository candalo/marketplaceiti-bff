package com.github.candalo.marketplaceitibff.widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class ProductControlWidget(val productWidget: ProductWidget, val controlColor: String) : Widget()