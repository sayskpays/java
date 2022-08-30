package com.inner_class;

class Outer{
    // field
    int outNum = 100;
    static int sNum = 200;

    // Method
    Runnable getRunnable(int i){
        int num = 100; // 지역 변수

        class MyRunnable implements Runnable{ // 지역 내부 클래스
            int localNum = 10; // 지역 내부 클래스의 인스턴스 변수
            @Override
            public void run() {
                //num = 200; // 지역 변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
                //i = 100; // 매개 변수도 지역 변수처럼 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runner = outer.getRunnable(10);

        runner.run();
    }
}
