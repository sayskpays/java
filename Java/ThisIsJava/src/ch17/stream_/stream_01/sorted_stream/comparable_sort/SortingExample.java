package ch17.stream_.stream_01.sorted_stream.comparable_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동",30));
        students.add(new Student("신용권",10));
        students.add(new Student("유미선",20));

        //점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
        students.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getName()+s.getScore()));
        System.out.println();

        //점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        students.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(student -> System.out.println(student.getName()+student.getScore()));
    }
}
