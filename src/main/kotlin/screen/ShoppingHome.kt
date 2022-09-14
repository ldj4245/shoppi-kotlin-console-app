package screen

import extensions.getNotEmptyString

class ShoppingHome {

    fun start(){

        showWelcomeMessage()
        showCategories()

    }
    private fun showWelcomeMessage() {
        println("안녕하세요, 환영해요")
        println("이름을 입력해주세요")

        val name = readLine().getNotEmptyString()

        println(
            """
            감사합니다. 반갑습니다 $name 님
            원하시는 카테고리를 입력해주세요.
        """.trimIndent()
        )
    }


    private fun showCategories() {

        val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }



}