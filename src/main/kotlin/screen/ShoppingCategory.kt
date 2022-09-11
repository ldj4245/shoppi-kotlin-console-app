package screen

class ShoppingCategory {
     fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        categories.forEach {
            println(it)
        }

        println("=> 장바구니로 이동하시려면 #을 입력해주세요")

        var selectedCategory = readLine()
        while (selectedCategory.isNullOrBlank()) {
            //카테고리의 값이 null이거나, 공백이라면 계속 반복하겠다?
            println("값을 입력해주세요")
            selectedCategory = readLine()

        }
        if (selectedCategory == "#") {
            //TODO 1. 장바구니 이동
        } else {
            if(categories.contains(selectedCategory)){
                //Todo 2. 카테고리 상품 목록 보여주기

            }else{

                showErrorMessage(selectedCategory)
            }


        }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        println("[$selectedCategory]: 존재하지 않는 카테고리 입니다. 다시 입력해주세요")
        showCategories()
    }

}