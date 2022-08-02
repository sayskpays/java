package com.object;

public class StudentObject {


    String studentName;
    int grade;
    int studentMoney;

    public StudentObject(String studentName, int grade, int money) {
        this.studentName = studentName;
        this.grade = grade;
        this.studentMoney = money;
    }


    // Method
    public void takeBus(Bus bus){
        bus.take(1000);
        // money 총계에서 500 을 뺌
        this.studentMoney -= 500;
    }

    public void takeSubway(Subway subway){
        subway.take(1500);
        this.studentMoney -= 1500;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(5000);
        this.studentMoney -= 5000;
    }



    public void showInfo(){
        System.out.println("change" + studentMoney);
    }

}
