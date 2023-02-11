package ch17.stream_.stream_01.set_stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");

        // Stream을 이용한 요소 반복 처리
        Stream<String> stream = set.stream(); // 스트림 얻기
        stream.forEach(name -> System.out.println(name));
    }
}
