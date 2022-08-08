package com.abstract_study;

public abstract class Computer {
    //Filed



    //Constructor

    //Method
    public abstract void display();
    public abstract void typing();
    public void turnOn(){

    }
    public void turnOff(){

    }

}

/*
*   추상 메소드를 선언하기 위해서는 클래스를 추상 클래스로 만들어 줘야 한다.
*
*   Computer를 상속받는 클래스 중
*   turnOn/turnOff 는 공통
*   display/ typing은 하위 클래스에 따라 구현
*
*   따라서 display/ typing은 Computer에서 구현하지 않고, 구현은 상속받는 클래스에 위임한다. -> 추상메서드의 정의
*
*
* */