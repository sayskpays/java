package ch17.stream_.stream_01.resoureces_stream.string_int_array_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "김미나"};

        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.println(item + ","));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        IntStream intStream1 = IntStream.of(intArray);

        intStream.forEach(item -> System.out.println(item+","));
        intStream1.forEach(item -> System.out.println(item+","));
        System.out.println();
    }
}
