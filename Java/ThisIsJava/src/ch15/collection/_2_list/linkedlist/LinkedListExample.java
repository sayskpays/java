package ch15.collection._2_list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        // 시작 시간과 끝 시간을 저장할 변수 선언
        long startTime;
        long endTime;

        // ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++){
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime));

        // LinkedList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++){
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime));
    }



}
