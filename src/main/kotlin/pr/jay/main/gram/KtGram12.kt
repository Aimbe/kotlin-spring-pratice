package pr.jay.main.gram

import java.io.BufferedWriter
import java.io.OutputStreamWriter

class KtGram12 {

    fun main() = with(System.`in`.bufferedReader()) {
        // 기본
        print("hello")

        // bufferedWriter
        val sout = BufferedWriter(OutputStreamWriter(System.out))
        sout.appendLine()
        sout.flush()
        sout.close();

        // 더 짧은 bufferedWriter
        val bw = System.out.bufferedWriter()

        //템플릿
        val s = "abc"
        println("$s.length is ${s.length}") // prints "abc.length is 3"


        //배열
        val arr1 = IntArray(4) { it }
// 내용물을 전체 확인하는 코드
        print(arr1.contentToString()) // 결과 [0, 1, 2, 3]

        val arr2 = IntArray(4) { it * 2 }
// 내용물을 전체 확인하는 코드
        print(arr2.contentToString()) // 결과 [0, 2, 4, 6]
    }

    val numbers = mutableListOf(1, 2, 3, 4)
    val stack = MutableList<Int>(4) { it }

// stack.push(5)
    numbers.add(5)

// stack.pop()
    numbers.removeLast()

// stack.peek()
    numbers.last()

// 비어있는지 확인
    numbers.isEmpty()

// 내용물이 있는지 확인
    numbers.isNotEmpty()

//크기
    numbers.size