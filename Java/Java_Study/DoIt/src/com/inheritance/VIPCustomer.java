package com.inheritance;

public class VIPCustomer {

    // Customer 클래스와 겹치는 변수
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // VIP 고객 관련 기능을 구현할때만 필요한 멤버 변수
    private int agentID; // VIP 고객 담당 상담원 아이디
    double saleRatio; // 할인율

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05; // 보너스 적립 5%
        saleRatio = 0.1; // 할인율 10%
    }

    public int calPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio); // 할인율 적용
    }

    public int getAgentID(){
        return agentID;
    }

    public String showCustomerInfo(){
        return customerName+customerGrade+bonusPoint;
    }
}

/*  Customer 클래스와 겹치는 멤버 변수와 메서드가 보인다.
*   일반 고객에게 제공하는 혜택을 기본으로 제공하고
*   추가적으로 속성과 메서드를 제공하고자 할 때 상속 사용
*
* */
