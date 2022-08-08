package com.design_pattern.template;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전");
    }

    @Override
    public void stop() {
        System.out.println("브레이크로 정지");
    }
}
