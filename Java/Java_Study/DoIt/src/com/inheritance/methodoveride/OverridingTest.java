package com.inheritance.methodoveride;

import com.inheritance.Customer;
import com.inheritance.VIPCustomerExtendsChange;

public class OverridingTest {
    public static void main(String[] args) {
        Customer hong = new Customer(1010,"lee");

        hong.bonusPoint = 1000;

        VIPCustomerExtendsChange jun = new VIPCustomerExtendsChange(1000,"jun",1234);
        jun.bonusPoint = 10000;

        int price = 10000;

        System.out.println(hong.calPrice(price));
        System.out.println(jun.calPrice(price));




        // 묵시적 클래스 형 변환과 메서드 재정의
        Customer soo = new VIPCustomerExtendsChange(10101,"soo",2000);
        soo.showCustomerInfo();
        // 이렇게 될 경우 calPrice 메서드는 Overring된 생성된 인스턴스의 메서드를 호출
        // 즉, VIPCustomerExtendsChange의 calPrice 메서드 호출 => 가상 메서드

        // 만약 같은


    }
}
