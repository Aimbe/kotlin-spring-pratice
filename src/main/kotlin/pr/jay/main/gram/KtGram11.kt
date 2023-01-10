package pr.jay.main.gram

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Integer.parseInt

class KtGram11 {

//코루틴 예제
    fun main() {
        GlobalScope.launch { // launch a new coroutine in background and continue
            delay(1000L) // non-blocking delay for 1 second
            println("World!") // print after delay
        }
        println("Hello") // main thread continues while coroutine is delayed
        Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
    }

}