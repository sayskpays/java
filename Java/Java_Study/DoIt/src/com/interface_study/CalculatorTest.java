package com.interface_study;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Calc는 인터페이스 이므로 인스턴스를 생성할 수 없고
        // Calculator도 마찬가지로 추상클래스 이므로 인터페이스를 생성할 수 없다.

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.divide(num1,num2));
        calc.showInfo();

        // CompleteCalc 클래스는 상위 클래스인 Calculator형이면서, Calc 인터페이스를 구현하였으므로 Calc형이기도 하다. -> 형 변환 가능

        Calc calcTypeChange = new CompleteCalc(); // 이렇게 하면 Calc의 추상메서드만 사용 가능 showInfo()는 없음.

    }
}
