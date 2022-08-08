package com.design_pattern.template;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("자율 주행");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춤");
    }

    @Override
    public void wiper() {
        System.out.println("wiper 자동 조절");
    }
}
