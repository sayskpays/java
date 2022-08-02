package com.object;

public class Subway {

    int subNumber;
    int Submoney;
    int count;

    public Subway(int subNumber) {
        this.subNumber = subNumber;
    }

    public void take(int money){
        // 지하철 요금 1500
        this.Submoney += money;
        count++;
    }

    public void showInfo(){
        System.out.println("지하철 번호 : "+ subNumber + " 승객 수 : " + count + " 수입은 : " + Submoney);
    }
}
