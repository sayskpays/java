package com.design_pattern.singleton;

public class SingletonPracticeUsed{

    // field
    static int ID = 1000;
    private int carNum;

    //constructor

    public SingletonPracticeUsed(){
        ID++;
        this.carNum = ID;
    }

    //method
    public int getCarNum() {
        return carNum;
    }

}
