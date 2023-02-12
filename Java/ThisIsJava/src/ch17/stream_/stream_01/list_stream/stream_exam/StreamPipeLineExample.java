package ch17.stream_.stream_01.list_stream.stream_exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<StudentDTO> list = Arrays.asList(
                new StudentDTO("홍길동", 10),
                new StudentDTO("신용권", 20),
                new StudentDTO("유미선", 30)
        );

        // 방법 1
        Stream<StudentDTO> studentDTOStream = list.stream();
        // 중간 처리(학생 객체를 점수로 매핑)
        IntStream scoreStream = studentDTOStream.mapToInt(student -> student.getScore());
        // 최종 처리(평균 점수)
        double avg = scoreStream.average().getAsDouble();

        // 방법2
        double avg1 = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println("평균점수" + avg1);

    }
}
