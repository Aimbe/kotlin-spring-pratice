package pr.jay.main.gram

class KtGram9 {


    /**
     * Applies the given [transform] function to each element of the original collection
     * and appends the results to the given [destination].
     */
    inline fun <T, R, C : MutableCollection<in R>> Iterable<T>.mapTo(destination: C, transform: (T) -> R): C {
        for (item in this)
            destination.add(transform(item))
        return destination
    }

    /*
    Kotlin에서는 mapOf() 함수를 통해서 쉽게 map을 생성.
    map의 값은 Key와 value가 구별되어야 하고 to를 통해서 설정.
    mapOf에서 값을 입력하지 않으면 타입 추론이 안되기 때문에 값이 없을 경우는 타입을 꼭 명시해야 함.*/
    fun main(){
        val map1 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
        val map2 = mapOf<String, Char>("key1" to '1', "key2" to '2', "key3" to '3')
        println(map1)       // {key1=1, key2=2, key3=3}
    }


    /*
    * mutableMapOf() 함수를 사용하여 가변형 Map을 생성.
      Map 또한 Generic으로 정의되어 있기 때문에 어떠한 타입도 설정 가능,
      여러 타입을 받길 원할 경우 모든 타입의 상위 클래스인 Any 클래스를 설정.
    * */
    fun main2(){
        val map1 = mutableMapOf<String,Int>("key1" to 1, "key2" to 2, "key3" to 3)
        val map2 = mutableMapOf<String, Any>("key1" to 1, "key2" to 2.2, "key3" to "3")
        println(map1)
    }

}