package com.design_pattern.template;

public class CarTest {
    public static void main(String[] args) {
        // 자율 주행
        Car myCar = new AICar();
        myCar.run();

        // 사람 운전
        Car hisCar = new ManualCar();
        hisCar.run();
    }
}
