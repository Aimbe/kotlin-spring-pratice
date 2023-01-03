package pr.jay.main.gram

class KtGram6 {

    //제네릭 (Generic)

    var age: Int = 0
        get() {
            return field
        }
        set(value) {
            field = if (value >= 0) value else 0
        }


    fun <T> toFunction(value: T): () -> T = { value }

    fun main(args: Array<String>) {
        val func: () -> Int = toFunction<Int>(1170)
        println(func())
    }

}