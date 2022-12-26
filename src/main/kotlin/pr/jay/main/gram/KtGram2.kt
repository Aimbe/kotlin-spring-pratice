package pr.jay.main.gram

class KtGram2 {

    //람다
    val fruits = listOf("banana", "avocado", "apple", "kiwi");
    fruits.filter { it.startsWith"a") }.sortedBy { it }.map { it.toUpperCase() }.forEach { println(it) }

    val items = setOf("apple", "banan", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}