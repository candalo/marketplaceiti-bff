package com.github.candalo.marketplaceitibff.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Price(
        val amount: Int,
        val scale: Int,
        val currencyCode: String
) {
    enum class Currency() {
        USD, EUR, BRL;

        fun getSymbol() = when(this) {
            USD -> "$"
            EUR -> "€"
            BRL -> "R$"
        }
    }
}