Thread(Runnable {
    for(i in 1..10) {
        Thread.sleep(1000L)
        print("I'm working in Thread.")
    }
}).start()
GlobalScope.launch() {
    repeat(10) {
        delay(1000L)
        print("I'm working in Coroutine.")
    }
}
아래는 코루틴에 대해서 초점을 맞춰서 가장 간단한 코루틴의 예제입니다.

print("Start Main Thread")
GlobalScope.launch {
    delay(3000)
    print("in Coroutine ...")
}
print("End Main Thread")