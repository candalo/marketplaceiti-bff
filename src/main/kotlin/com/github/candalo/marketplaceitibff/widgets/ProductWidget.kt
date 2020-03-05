package com.github.candalo.marketplaceitibff.widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class ProductWidget(
        val id: String,
        val title: String,
        val titleColor: String,
        val titleSize: Int,
        val subtitle: String,
        val subtitleColor: String,
        val subtitleSize: Int,
        val description: String,
        val descriptionColor: String,
        val descriptionSize: Int,
        val imageUrl: String,
        val value: String,
        val valueColor: String,
        val valueSize: Int
) : Widget()