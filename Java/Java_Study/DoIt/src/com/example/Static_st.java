package com.example;

/*
*  학생 클래스를 사용하여 학생의 인스턴스를 만들고자 할 때,
*  고유한 학번을 자동으로 생성하고자 함,
*  이때 인스턴스마다 새로 생성되는 변수가 아닌, 클래스 전반에 자원을 공유할 수 있는 변수가 필요함
*
*  학생이 한명 생성 될 때 마다 static 변수 값을 하나씩 증가시켜 학생 인스턴스의 학번 변수에 대입
*
*
* */

public class Static_st {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = innerMethod(num1, num2);
    }// main

    // 내부 Method
    // 정적 메소드 static : new로 인스턴스를 만들지 않아도 실행 할 수 있게 해줌.
    // static이 붙으면 자원을 공유 한다. static 변수, static 메소드 마찬가지.
    static int innerMethod(int n1, int n2){
        int result = n1 + n2;
        return result;
    }// static method






}// class
