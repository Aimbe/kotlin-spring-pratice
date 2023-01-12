//package pr.jay.main.tddModule
//
//class TestModule {
//
//    internal class CalculatorAnnotationSpec: AnnotationSpec() {
//        private val sut = Calculator()
//
//        @Test
//        fun `1과 2를 더하면 3이 반환된다`() {
//            val result = sut.calculate("1 + 2")
//
//            result shouldBe 3
//        }
//
//        @Test
//        fun `식을 입력하면, 해당하는 결과값이 반환된다`() {
//            calculations.forAll { (expression, answer) ->
//                val result = sut.calculate(expression)
//
//                result shouldBe answer
//            }
//        }
//
//        @Test
//        fun `입력값이 null 이거나 빈 공백 문자일 경우 IllegalArgumentException 예외를 던진다`() {
//            blanks.forAll {
//                shouldThrow<IllegalArgumentException> {
//                    sut.calculate(it)
//                }
//            }
//        }
//
//        @Test
//        fun `사칙연산 기호 이외에 다른 문자가 연산자로 들어오는 경우 IllegalArgumentException 예외를 던진다 `() {
//            invalidInputs.forAll {
//                shouldThrow<IllegalArgumentException> {
//                    sut.calculate(it)
//                }
//            }
//        }
//
//        companion object {
//            private val calculations = listOf(
//                    "1 + 3 * 5" to 20.0,
//                    "2 - 8 / 3 - 3" to -5.0,
//                    "1 + 2 + 3 + 4 + 5" to 15.0
//            )
//            private val blanks = listOf("", " ", "      ")
//            private val invalidInputs = listOf("1 & 2", "1 + 5 % 1")
//        }
//    }
//}