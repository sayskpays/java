package com.inheritance;

public class CustomerTest {
    public static void main(String[] args) {

        // 일반 고객

        Customer customerHong = new Customer(1002,":");
        // protected 변수이기 때문에 set()메서드로 지정
        customerHong.setCustomerID(10010);
        customerHong.setCustomerName("LEE");

        customerHong.bonusPoint = 1000;
        System.out.println(customerHong.showCustomerInfo());

        // VIP 고객
        // 인스턴스를 생성할때 부모(Customer) 생성자 호출 후에 자식(VIPCustomerExtendsChange) 생성자 호출
        Customer customerVIP = new VIPCustomerExtendsChange(1001,"김유신",1003);
        // -> 상위 클래스로 묵시적 클래스 형 변환
        // -> Customer 클래스의 멤버 변수와 메서드만 사용 가능
        // VIPCustomerExtendsChange 클래스의 showVIPInfo 메서드는 사용하지 못함.
        // 이렇게 사용하는 이유는 메서드 오버라이딩과 다형성 때문.


        customerVIP.setCustomerID(10020);
        customerVIP.setCustomerName("HONG");
        customerVIP.bonusPoint = 1000;
        System.out.println(customerVIP.showCustomerInfo());

    }
}
