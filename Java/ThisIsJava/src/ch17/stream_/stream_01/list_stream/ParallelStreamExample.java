package ch17.stream_.stream_01.list_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        // 병렬 처리
        Stream<String> parallelStream = list.parallelStream(); // 병렬 스트림 얻기
        parallelStream.forEach(name -> {
            System.out.println(name + ":" + Thread.currentThread().getName());
        });
    }
}
