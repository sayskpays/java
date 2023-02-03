package ch15.collection._2_list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 컬렉션 생성
        List<BoardDTO> list = new ArrayList<>();

        // 객체 추가
        list.add(new BoardDTO("제목1", "내용1", "글쓴이1"));
        list.add(new BoardDTO("제목2", "내용2", "글쓴이2"));

        //저장된 총 객체 수 얻기
        int size = list.size();

        // 특정 인덱스 객체 가져오기
        BoardDTO dto = list.get(1);
        System.out.println(dto.getContent()  + dto.getSubject() + dto.getWriter());

        for(BoardDTO test :list){
            System.out.println(test.getContent() + test.getSubject() + test.getWriter());
        }

        //객체 삭제
        list.remove(2);

    }
}
