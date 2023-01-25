package pr.jay.main.gram

import java.lang.Integer.parseInt

class KtGram13 {

// src/test/kotlin/com/example/kotlintdd/DSL.kt
    package com.example.kotlintdd

    import io.github.ludorival.kotlintdd.GWTContext

    val GWTContext<*, *>.`a todo list` get() = action.createTodoList()

    fun GWTContext<*, *>.`an item`(name: String) = action.createItem(name)

    val GWTContext<*, *>.`I add the last item into my todo list` get() =
        action.addItem(first<TodoList>(), last<Item>())

    val GWTContext<*, *>.`I expect this item is present in my todo list` get() =
        assertTrue(first<TodoList>().contains(last<Item>()))
}