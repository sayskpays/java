package ch15.collection._2_list.vector;

import ch15.collection._2_list.arraylist.BoardDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Vector 컬렉션 생성
        List<BoardDTO> list = new ArrayList<>();
        // 작업 스레드 객체 생성
        Thread threadA = new Thread(){
            @Override
            public void run(){
                //객체 1000개 추가
                for(int i=1; i<= 1000; i++){
                    list.add(new BoardDTO("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        // 작업 스레드 객체 생성
        Thread threadB = new Thread(){
            @Override
            public void run(){
                for(int i=1001; i<=2000; i++){
                    list.add(new BoardDTO("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        threadA.start();
        threadB.start();

        try{
        threadA.join();
        threadB.join();
        }catch (Exception e){
        }

        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수"+ size);


    }
}
