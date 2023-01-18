package pr.jay.main.gram

import org.jetbrains.kotlin.com.intellij.util.Function.Mono
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
    fun getItemListByType(userId: org.jetbrains.kotlin.com.intellij.util.Function.Mono<String?>, type: ItemInformation.Type?): Flux<ItemInformation?>? {
        return userId
                .flatMap(userRepo::findById)
                .switchIfEmpty(org.jetbrains.kotlin.com.intellij.util.Function.Mono.empty())
                .map(User::getInventory)
                .flatMapMany(Flux::fromIterable)
                .filter { item -> ItemInformation.isType(item, type) }
    }