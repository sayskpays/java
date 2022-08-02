package com.example;


// 참조 변수는 힙 메모리에 생성된 인스턴스를 가리킨다.
public class newInstance {
    public static void main(String[] args) {
        // getInstance : 참조변수
        Oop getInstance = new Oop(123,"hong");

        // 참조 변수에는 힙 메모리에 생성된 인스턴스의 메모리 주소가 저장 => 참조 값
        System.out.println(getInstance);

    }



}
