package com.inheritance;

public class VIPCustomerExtendsChange extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomerExtendsChange(){
        customerGrade = "VIP"; // 상위 클래스에서 private이여서 에러 발생 -> protected로 변경
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }

}
