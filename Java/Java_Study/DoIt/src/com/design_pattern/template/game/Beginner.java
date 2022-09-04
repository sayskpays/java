package com.design_pattern.template.game;

public class Beginner extends PlayerLevel {


    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {

        System.out.println("X");
    }

    @Override
    public void turn() {

        System.out.println("X");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("초보자");
    }
}

