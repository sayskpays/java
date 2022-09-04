package com.final_study;

/*
*   final
*
*   변수 : final 변수는 상수를 의미
*   메서드 : final 메서드는 하위 클래스에서 재정의할 수 없음.
*   클래스 : final 클래스는 상속할 수 없음 !!! (String, Integer 등)
*
*   final은 하나의 클래스 내에서만 사용하게 된다.
*   공유 상수를 만들기 위해서는 public static final로 정의 한다.
*   -> static으로 지정했기 때문에 인스턴스를 생성하지 않고 클래스 이름으로 참조할 수 있다.
*
*
*/

public class Constant {
    int num = 10;
    final int NUM = 100;

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 50;
        //cons.NUM = 200; -> 오류

        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}
