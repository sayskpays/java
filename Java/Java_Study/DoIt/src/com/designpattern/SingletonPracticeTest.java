package com.designpattern;

public class SingletonPracticeTest {

    public static void main(String[] args) {

        SingletonPractice test = SingletonPractice.getInstance();
        SingletonPracticeUsed my = test.createCar();
        SingletonPracticeUsed me = test.createCar();

        System.out.println(my.getCarNum());
        System.out.println(me.getCarNum());


    }
}
