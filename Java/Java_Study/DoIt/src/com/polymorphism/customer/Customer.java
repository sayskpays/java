package com.polymorphism.customer;

public class Customer {


    // Filed
    protected int customerID;
    protected  String customerName;
    protected  String customerGrade;
    public int bonusPoint;
    protected double bonusRatio;



    // Constructor
    public Customer() {
        initCustomer();
    }


    public Customer(int customerID, String customerName) {

        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();
    }

    // Method
    // 생성자에서만 호출하는 메서드이므로 private로 선언
    private void initCustomer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName+customerGrade+bonusPoint;
    }
}
