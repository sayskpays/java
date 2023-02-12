package ch17.stream_.stream_01.filter_stream.mapping_stream;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {

        List<StudentDTO> studentDTOList = new ArrayList<>();
        studentDTOList.add(new StudentDTO("홍길동",85));
        studentDTOList.add(new StudentDTO("홍길동",92));
        studentDTOList.add(new StudentDTO("홍길동",87));

        // Student를 score 스트림으로 변환
        studentDTOList.stream()
                .mapToInt(s -> s.getScore())
                .forEach(score -> System.out.println(score));
    }
}
