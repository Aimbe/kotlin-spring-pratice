package pr.jay.main.gram

class KtGram3 {

    fun main() {
        var charValue: Char = 'a'
        var koreanCharValue: Char = '가'
        var stringValue = "one line string test"
        var multiLineStringValue = """multiline
    string
    test"""
    }


    fun main2() {
        var intValue:Int = 1234
        var longValue:Long = 1234L //L을 붙여 더 큰 메모리를 사용하는 정수임을 표시
        var intValueByHex:Int = 0x1af //16진수
        var intValueByBin:Int = 0b //2진수 (binary 약자)
        //코틀린은 8진수 표기는 지원하지 않는다.

        var doubleValue:Double = 123.5 //실수는 소수점을 포함해 숫자를 쓰거나
        var doubleValueWithExp:Double = 123.5e10 //필요시 지수 표기법을 추가한다.
        var floatValue:Float = 123.5f //Float는 f를 붙인다.
    }


    var name = ""
    var date = ""
    var area = 0

    fun print() {
        println("이름: " + this.name)
        println("건축일자: " + this.date)
        println("면적: ${this.area}m2")
    }

}