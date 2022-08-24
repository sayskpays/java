package com.jdk_study;


/*
*   여러 클래스 중에서 다른 클래스를 사용할때도 있고,
*   반환받는 클래스가 어떤 자료형인지 모를 때도 있다.
*   이때, Class 클래스 활용
*
* */
public class ClassClass {
    // 클래스 정보를 가져오는 세 가지 방법

    //1. Object 클래스의 getClass() 메서드 사용하기
    String s = new String();
    Class c1 = s.getClass();

    //2. 클래스 파일 이름을 Class 변수에 직접 대입하기
    Class c2 = String.class;

    //3. Class.forName("클래스 이름") 메서드 사용하기
    Class c = Class.forName("java.lang.String");

    public ClassClass() throws ClassNotFoundException {
    }
}
