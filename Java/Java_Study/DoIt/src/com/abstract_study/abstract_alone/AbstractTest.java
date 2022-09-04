package com.abstract_study.abstract_alone;

public class AbstractTest{
    public static void main(String[] args) {
        AbstractEx a = new AbstractEx() {
            @Override
            public void turnOn() {
                super.turnOn();
            }
        };
    }
}
