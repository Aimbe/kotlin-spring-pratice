package pr.jay.main.gram;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class JavaStreamPratice {


    public void test1(){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));

    Iterator<String> iterator = list.iterator();

    while(iterator.hasNext()) {
        String value = iterator.next();

        if ("b".equals(value)) {
            System.out.println("값 : " + value);
        }
    }
    }

    public void test2(){

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        list.stream()
                .filter("b"::equals)
                .forEach(System.out::println);

    }

    public void test3(){

        String[] array = new String[]{"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);
        Stream<String> stream2 = Arrays.stream(array, 1, 3); // 인덱스 1포함, 3제외 ("b", "c")

    }

//    public void test4(){
//
//
//
//        String<String> stream = Stream<String>builder()
//                .add("Apple")
//                .add("Banana")
//                .add("Melon")
//                .build();
//
//    }
}
