//package pr.jay.main.controller
//
//import org.springframework.ui.Model
//import org.springframework.ui.set
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.RestController
//import org.testng.annotations.Test
//
//@RestController
//class TestController {
//
//
//    @GetMapping("/")
//    fun blog(model: Model): String{
//        model["title"] = "TT"
//        return "Test"
//    }
//
//    @Test
//    fun constructor() {
//        // 생성자 자동 생성
//        assertDoesNotThrow {
//            Person("dfdf", 23, "K")
//        }
//        // 파라미터 디폴트 값 지정 가능
//        assertDoesNotThrow {
//            Person("dfdf", 23)
//        }
//        // 파라미터 순서 변경 가능
//        assertDoesNotThrow {
//            Person(age = 23, name = "dfdf", nickname = "K")
//        }
//    }
//}