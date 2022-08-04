package com.inheritance;

public class Customer {

    // filed

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio; // 적립 비율

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    // Constructor
    public Customer(){
        customerGrade = "SILVER"; // 기본 등급
        bonusRatio = 0.01; // 보너스 포인트 기본 적립 비율
    }

    // Method

    // 보너스 포인트 적립, 지불 가격 계산 메서드
    public int calPrice(int price){
        bonusPoint += price * bonusRatio; // 보너스 포인트 계산
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "" + customerGrade + "" + bonusPoint;
    }

}

/*
*   Customer의 코드는 객체 지향
*   하지만 VIP 등급이 생겨 새로운 변수와 메서드를 포함하여 구현하고자 함
*
*   일반 고객의 인스턴스를 생성할때는 VIP 고객과 관련된 기능이 필요치 않은데
*   같이 생성되어 자원의 낭비 발생
*
*   이럴때는 VIP 클래스를 분리한다.
*
* */
