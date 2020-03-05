package com.github.candalo.marketplaceitibff.widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class OrderStatusWidget(
        val state: State,
        val orderStatusTitle: String,
        val orderStatusTitleColor: String,
        val orderStatusMessage: String,
        val orderStatusMessageColor: String
) : Widget() {

    enum class State {
        Success, Error
    }

}