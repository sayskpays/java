package com.object;

public class Taxi {

    int taxiNumber;
    int taxiMoney;
    int count;

    public Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    // Method

    public void take(int money){
        this.taxiMoney += money;
        count++;
    }

    public void showInfo(){
        System.out.println("택시 이용객 : " + count + "택시 수입 : " + taxiMoney + "택시 번호 : " + taxiNumber);
    }
}
