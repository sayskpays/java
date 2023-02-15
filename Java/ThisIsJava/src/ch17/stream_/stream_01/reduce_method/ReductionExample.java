package ch17.stream_.stream_01.reduce_method;

import ch17.stream_.stream_01.sorted_stream.comparable_sort.Student;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    // 수정할 수 없는 List 생성
    List<Student> studentList = Arrays.asList(
      new Student("홍길동", 92),
      new Student("신용권", 95),
      new Student("김자바", 88)
    );

    // 방법 1
    int sum1 = studentList.stream()
            .mapToInt(Student :: getScore)
            .sum();

    // 방법 2
    int sum2 = studentList.stream()
            .map(Student :: getScore)
            .reduce(0, (a,b) -> a+b);

    // sum1 과 sum2의 결과는 같다.

}
