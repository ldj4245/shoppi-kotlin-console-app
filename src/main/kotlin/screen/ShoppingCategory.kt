package screen

import extensions.getNotEmptyString

class ShoppingCategory {
     fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        categories.forEach {
            println(it)
        }

        println("=> 장바구니로 이동하시려면 #을 입력해주세요")

        val selectedCategory = readLine().getNotEmptyString()
        if (selectedCategory == "#") {
            val shoppingCart = ShoppingCart()
            shoppingCart.showCarItemes()
        } else {
            if(categories.contains(selectedCategory)){
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(selectedCategory)
            }else{

                showErrorMessage(selectedCategory)
            }


        }
    }

    private fun showErrorMessage(selectedCategory: String) {
        println("[$selectedCategory]: 존재하지 않는 카테고리 입니다. 다시 입력해주세요")
        showCategories()
    }

}