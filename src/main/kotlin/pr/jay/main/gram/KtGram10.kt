package pr.jay.main.gram

import java.lang.Integer.parseInt

class KtGram10 {

    //parse int
    fun parseInt2(str: String): Int? {
        val numberList = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
        if(numberList.contains(str)){
            return parseInt(str)
        } else{
            return null
        }
    }

    fun printProduct2(arg1: String, arg2: String) {
        val x = parseInt2(arg1)
        val y = parseInt2(arg2)

        if(x == null) {
            println("Wrong number format in arg1: '$arg1'")
            return
        }

        if(y == null) {
            println("Wrong number format in arg1: '$arg2'")
            return
        }

        println(x * y)
    }

}