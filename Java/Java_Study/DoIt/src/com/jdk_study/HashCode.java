package com.jdk_study;

/*
*   hashCode() : 정보를 저장하거나 검색할 때 사용하는 자료구조
*
*   Key 값을 매개 변수로 넣으면 그 각체가 저장되어야 할 위치나 저장된 해시 테이블 주소를 반환
*
*   Ex) index = hash(key)
*
*
*   equals 메서드를 Overriding 했다면 hashCode() 메서드도 Overriding이 필요
*
*
* */

public class HashCode {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());


    }
}
