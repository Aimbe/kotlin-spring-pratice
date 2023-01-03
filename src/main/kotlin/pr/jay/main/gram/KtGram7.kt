package pr.jay.main.gram

class KtGram7 {

    //  구체화된(Reified) 타입 매개변수

    inline fun <reified T> check() {
        val number = 0

        if (number is T)
            println("T는 Int 타입입니다.")
    }

}