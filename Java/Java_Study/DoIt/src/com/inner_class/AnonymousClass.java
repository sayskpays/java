package com.inner_class;

class Outer2{
    /* 1번 변수 방식 / 익명 내부 클래스 */
    Runnable runner = new Runnable() {
        @Override
        public void run() {

        }
    };// 인터페이스나 추상 클래스형 변수를 선언하고 클래스를 생성해 대입하는 방법


    /*2번 메서드 방식 / 익명 클래스 */
    Runnable getRunnable(int i){
        int num = 100; // 상수

        return new Runnable() { // 익명 내부 클래스, Runnable 인터페이스 생성
            @Override
            public void run() {
                // num = 200; 에러발생 (이유 : 지역 내부 클래스 , 익명 내부 클래스의 메서드 안 지역 변수는 상수처리 되기 때문에 값을 변경 할 수 없다.)
                // i = 10; 에러발생
            }
        }; // 클래스 끝에 ;를 써줘야 한다.
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runnable = out.getRunnable(10);
        runnable.run(); // 메서드 방식 생성 익명 클래스

        out.runner.run();// 변수 방식 생성 익명 내부 클래스 사용
    }
}
