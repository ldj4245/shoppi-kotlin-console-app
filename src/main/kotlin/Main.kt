fun main(args: Array<String>) {


    println("안녕하세요, 환영해요")
    println("이름을 입력해주세요")

    val name = readLine()

    println(
        """
        감사합니다. 반갑습니다 $name 님
        원하시는 카테고리를 입력해주세요.
    """.trimIndent()
    )


    val categories = arrayOf("패션","전자기기","반려동물용품")
    categories.forEach {
        println(it)
    }

    println("=> 장바구니로 이동하시려면 #을 입력해주세요")

    var selectedCategory = readLine()
    while(selectedCategory.isNullOrBlank()){
        //카테고리의 값이 null이거나, 공백이라면 계속 반복하겠다?
        println("값을 입력해주세요")
        selectedCategory = readLine()

    }
    if(selectedCategory == "#"){
        //TODO 1. 장바구니 이동
    }else{

        //Todo 2. 카테고리 상품 목록 보여주기
        //todo 3. 카테고리 목록에 없는 값을 입력하는 경우
    }

}