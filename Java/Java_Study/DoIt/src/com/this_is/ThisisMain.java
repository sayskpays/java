package com.this_is;

public class ThisisMain {

    public static void main(String[] args) {


        ThisIs1 test = new ThisIs1();
        test.setYear(2000);

        System.out.println(test.year);
        // test 참조변수 출력 : ThisIs1 클래스의 인스턴스 힙 주소 출력
        // 즉, this는 생성된 인스턴스 자신을 가리키는 역할
        test.printThis();
    }
}
