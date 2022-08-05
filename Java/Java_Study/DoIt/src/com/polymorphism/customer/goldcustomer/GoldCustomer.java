package com.polymorphism.customer.goldcustomer;

import com.polymorphism.customer.Customer;

public class GoldCustomer extends Customer {

    // Field
    double saleRatio;

    // Constructor
    public GoldCustomer(int customerID, String customerName){
        super(customerID, customerName);

        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    // Method

    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
