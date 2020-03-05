package com.github.candalo.marketplaceitibff

import br.com.zup.beagle.widget.layout.Horizontal
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.ListView
import com.github.candalo.marketplaceitibff.models.Price
import com.github.candalo.marketplaceitibff.models.Product
import com.github.candalo.marketplaceitibff.widgets.OrderStatusWidget
import com.github.candalo.marketplaceitibff.widgets.ProductControlWidget
import com.github.candalo.marketplaceitibff.widgets.ProductDetailsWidget
import com.github.candalo.marketplaceitibff.widgets.ProductWidget
import org.springframework.stereotype.Service

@Service
class MarketplaceService {

    fun getProducts(): Screen {
        val productPairs = getProductsMock().chunked(2).map { productPair ->
            Horizontal(children = productPair.map { product ->
                ProductWidget(
                        product.id,
                        product.shortDescription,
                        "#666666",
                        16,
                        product.longDescription,
                        "#909090",
                        12,
                        product.imageUrl,
                        "${Price.Currency.valueOf(product.price.currencyCode).getSymbol()}${product.price.amount}",
                        "#FE5886",
                        14
                )
            })
        }
        return Screen(content = ListView(rows = productPairs))
    }

    fun getProductById(id: String): Screen {
        val product = getProductsMock()[0]
        val productWidget = ProductWidget(
                product.id,
                product.shortDescription,
                "#666666",
                16,
                product.longDescription,
                "#909090",
                12,
                product.imageUrl,
                "${Price.Currency.valueOf(product.price.currencyCode).getSymbol()}${product.price.amount}",
                "#FE5886",
                14
        )
        val productControlWidget = ProductControlWidget("#FE5789")

        return Screen(content = ProductDetailsWidget(productWidget, productControlWidget))
    }

    fun getProductsOrdersStatus(state: String) = Screen(
            content = OrderStatusWidget(
                    if (state == "success") OrderStatusWidget.State.Success else OrderStatusWidget.State.Error,
                    "Order successfully!",
                    "#FE5886",
                    "All right with your order.",
                    "#000000"
            )
    )

    private fun getProductsMock() = listOf(
            Product(
                    1,
                    "1",
                    "Espresso",
                    "Blue Ridge Blend",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/A_small_cup_of_coffee.JPG",
                    Price(
                            10,
                            1,
                            "USD"
                    )
            ),
            Product(
                    2,
                    "2",
                    "Choco Frappe",
                    "Locally Roasted",
                    "https://media3.s-nbcnews.com/j/newscms/2019_33/2203981/171026-better-coffee-boost-se-329p_67dfb6820f7d3898b5486975903c2e51.fit-760w.jpg",
                    Price(
                            20,
                            2,
                            "EUR"
                    )
            ),
            Product(
                    3,
                    "3",
                    "Caramel Frappe",
                    "Decaf Colombia",
                    "https://www.indigofinance.com.au/wp-content/uploads/2018/07/istock-157528129.jpg ",
                    Price(
                            10,
                            1,
                            "USD"
                    )
            )
    )
}