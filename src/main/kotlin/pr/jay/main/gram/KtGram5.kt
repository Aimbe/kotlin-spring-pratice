package pr.jay.main.gram

class KtGram5 {

    fun main() {
        var a = 1234 //int
        var b = 1234L //long

        var c = 12.45 //Double
        var d = 12.45f //float

        var e = 0xABCD //16진수
        var f = 0b0101010 //2진수

        var g = true //boolean
        var h = 'C' //Char
    }

    fun main2() {
        println(add(5, 6, 7))
    }

    fun add(a: Int, b: Int, c:Int): Int {
        return a + b + c
        //리턴 발생 시 함수 중간이더라도 함수 종료
    }


}