package pr.jay.main.gram

class KtGram8 {

    //  제네릭이 적용된 클래스 / 인터페이스 상속, 구현하기

    interface Plusable<T> {
        operator fun plus(other: T): T
    }

    class Rectangle(val width: Int, val height: Int) : Plusable<Rectangle> {

        override fun plus(other: Rectangle): Rectangle {
            return Rectangle(width + other.width, height + other.height)
        }
    }

}