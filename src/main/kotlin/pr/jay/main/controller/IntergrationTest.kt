package pr.jay.main.controller

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class, MockitoExtension::class)
class IntegrationTests {
    private val url = "http://localhost:8080/spring-rest/v1"
    private val restTemplate = RestTemplate()
    override fun createTodoList(): TodoList {
        val response: ResponseEntity<TodoList> = restTemplate
                .exchange("$url/todo",
                        HttpMethod.POST,
                        HttpEntity(TodoList()),
                        TodoList::class.java)
        return response.body!!
    }

    override fun createItem(name: String): Item {
        val response: ResponseEntity<Item> = restTemplate
                .exchange("$url/item",
                        HttpMethod.POST,
                        HttpEntity(Item(name)),
                        Item::class.java)
        return response.body!!
    }

    override fun addItem(todoList: TodoList, item: Item): TodoList {
        val response: ResponseEntity<TodoList> = restTemplate
                .exchange(
                        "$url/todo/${todoList.id}/add",
                        HttpMethod.PUT,
                        HttpEntity(item),
                        TodoList::class.java
                )
        return response.body!!
    }
}