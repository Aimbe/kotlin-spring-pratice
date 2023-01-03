package pr.jay.main.gram

class KtGram2 {

    //여러 타입을 인수로 받기

    fun <T, R> toFunction(value1: T, value2: R): () -> T = { value1 }

    fun main(args: Array<String>) {
        val func: () -> Int = toFunction<Int, String>(1170, "test")
        println(func())
    }
}