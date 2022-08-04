package com.array;


/*
*   ArrayList 클래스 주요 메서드
*
*   boolean add(E e)
*   int size()
*   E get(int index) : 배열의 index 위치에 있는 요소 값을 반환
*   E remove(int index) : 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환
*   boolean isEmpty() : 배열이 비어 있는지 확인
*
* */


/*
*
*   ArrayList<E> 배열 이름 = new ArrayList<E>();
*   <E> 와 같은 형태를 제네릭 자료형이라 함.
*
*
*
* */

import java.util.ArrayList;

public class ArraylistStudy {
    public static void main(String[] args) {
        ArrayList<ArrayObject> test = new ArrayList<>();

        test.add(new ArrayObject("hong",13));
        test.add(new ArrayObject("jun",14));

        for(int i=0; i<test.size(); i++){
            System.out.println(test.get(i));
        }

        for(ArrayObject a : test){
            System.out.println(a);
        }
    }


}
