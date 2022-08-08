package com.inheritance;

public class VIPCustomerExtendsChange extends Customer{


    private int agentID;
    double saleRatio;

    String testInstance;

//
//    public VIPCustomerExtendsChange(){
//
//        // super(); // 상위 클래스 디폴트 생성자 호출 (자동으로 하위 클래스에서 생성된다.)
//        customerGrade = "VIP"; // 상위 클래스에서 private이여서 에러 발생 -> protected로 변경
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//
//        System.out.println("VIPCustomerExtendsChange() 생성자 호출");
//    }


    // SUPER 사용
    public VIPCustomerExtendsChange(int customerID, String customerName, int agentID){
        // 부모 생성자에 파라미터가 들어가 있으면 자식 생성자에서도 super를 통해서 똑같이 생성해줘야 한다.
        // 그게 아니라면 부모 default 생성자를 사용해야함
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomerExtendsChange(int, String) 생성자 호출");
    }

    public int getAgentID(){
        return agentID;
    }

    // 메소드 super 참조
    public String showCustomerInfo(){
        return super.showCustomerInfo()+"담당 상담원 아이디는" + agentID + "입니다.";
    }

    @Override
    public int calPrice(int price){
        bonusPoint += price * bonusRatio;
        return  price - (int)(price * saleRatio);
    }



}
