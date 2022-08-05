package com.polymorphism.customer;

public class CustomerVIP extends Customer{

    // Field
    private int agentID;
    double saleRatio;

    public CustomerVIP(int customerID, String customerName, int agentID){
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
    @Override
    public String showCustomerInfo(){
        return super.showCustomerInfo() + agentID;
    }


}
