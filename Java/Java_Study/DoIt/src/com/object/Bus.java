package com.object;

public class Bus {

    int busNumber;
    int count;
    int busMoney;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money){
        // 버스 수입
        this.busMoney += money;
        count++;
    }

    public void showInfo(){
        System.out.println("버스 번호 : "+ busNumber + " 승객 수 : " + count + " 수입은 : " + busMoney);
    }
}
