package com.object;

public class TakeTrans {

    public static void main(String[] args) {

        StudentObject studentA = new StudentObject("hong",5,2000);
        StudentObject studentB = new StudentObject("jun",3,5000);
        StudentObject studentC = new StudentObject("jun",3,10000);


        Bus bus100 = new Bus(100);
        studentA.takeBus(bus100);
        studentA.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway(2);
        studentB.takeSubway(subwayGreen);
        studentB.showInfo();
        subwayGreen.showInfo();

        Taxi Taxi500 = new Taxi(500);
        // 이미 생성한 참조 변수를 가지고 연산할 경우 값이 누적 된다.
        // 이러한 경우는 인스턴스를 새로 생성해줘야 한다.
        studentB.takeTaxi(Taxi500);
        studentB.showInfo();
        Taxi500.showInfo();

        // Taxi500 인스턴스도 마찬가지로 생성되어 있는 것 이기 때문에 Taxi 수입 누적
        studentC.takeTaxi(Taxi500);
        studentC.showInfo();
        Taxi500.showInfo();




    }
}
