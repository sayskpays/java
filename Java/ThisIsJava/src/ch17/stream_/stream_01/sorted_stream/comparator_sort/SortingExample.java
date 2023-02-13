package ch17.stream_.stream_01.sorted_stream.comparator_sort;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 20));
        studentList.add(new Student("유마선", 10));

        //점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((s1, s2)-> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s -> System.out.println(s.getScore()+s.getName()));
        System.out.println();

        //점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s-> System.out.println(s.getScore()+s.getName()));
        System.out.println();

    }
}
