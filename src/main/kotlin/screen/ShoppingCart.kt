package screen

import data.CartItems

class ShoppingCart{ //쇼핑카트에는 당연히 리스트를 보여줘야 하기 때문에
    private val products = CartItems.products

    fun showCarItemes(){
        if(products.isNotEmpty()){
            println(products.keys.joinToString(
                separator = ",\n",
                prefix="""
                    ***==============================***
                    장바구니에 담은 상품 목록 입니다.
                """
            ) { product ->
                "카테고리 : ${product.categoryLabel} / 상품명:${product.name}/수량:${products[product]}"

            }

            )

        }else{
            println("""
                장바구니에 담긴 상품이 없습니다.
            """.trimIndent())
        }
    }

}