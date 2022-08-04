package com.inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerHong = new Customer();
        // protected 변수
        customerHong.setCustomerID(10010);
        customerHong.setCustomerName("LEE");

        customerHong.bonusPoint = 1000;
        System.out.println(customerHong.showCustomerInfo());
    }
}
