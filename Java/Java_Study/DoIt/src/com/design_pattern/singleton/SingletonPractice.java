package com.design_pattern.singleton;

public class SingletonPractice {

    // field
    private static SingletonPractice instance = new SingletonPractice();

    // constructor
    private SingletonPractice(){}

    //method
    public static SingletonPractice getInstance(){
        if(instance == null){
            instance = new SingletonPractice();
        }


        return instance;
    }
    public SingletonPracticeUsed createCar(){
        return new SingletonPracticeUsed();
    }


}
