package com.polymorphism.customer;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(1010,"Lee");
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());

        Customer customerHong = new CustomerVIP(1020, "HONG",12345);
        customerHong.bonusPoint = 1000;

        System.out.println(customerHong.showCustomerInfo());

        int price = 10000;
        int leePrice = customerLee.calcPrice(price);
        int hongPrice = customerHong.calcPrice(price);

        System.out.println(leePrice);
        System.out.println(hongPrice);




    }
}
