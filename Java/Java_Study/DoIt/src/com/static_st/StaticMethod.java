package com.static_st;


public class StaticMethod {
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
