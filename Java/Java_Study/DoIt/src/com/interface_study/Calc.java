package com.interface_study;

public interface Calc {
    // 인터페이스에서 선언한 변수는 컴파일 과정에서 상수(static final)로 변한됨
    double PI = 3.14;
    int ERROR = -9999999;

    // 인터페이스에서 선언한 메서드는 추상메서드로 컴파일 과정에서 변환됨
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }// 디폴트 메서드

    static int total(int[] arr){

        int total = 0;
        for(int i : arr){
            total += i;
        }
        return  total;
    }// 정적 메서드

    private void myMethod(){
        System.out.println("private 메서드 입니다.");
    }// private 메서드 : 추상메서드에는 사용 불가. 다른 곳에서 Overriding 하여 사용하는 것도 불가. 인터페이스 내의 디폴트 메서드에서 사용, 정적 메서드에서는 사용 불가

    private static void myStaticMethod(){
        System.out.println("private static 메서드 입니다.");
    }// private static 메서드, 인터페이스 내의 디폴트 메서드, 정적 메서드 둘 다 사용 가능하다.


}

