package com.design_pattern.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("차가 움직입니다.");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    final public void run(){
        startCar();
        drive();
        stop();
        turnOff();
    }// 템플릿 메서드

}

/*
*   템플릿 메서드 : 메서드의 실행 순서와 시나리오 정의
*   템플릿 메서드에서 호출하는 메서드가 추상 메서드라면 클래스에 따라 구현 내용이 바뀜.
*   -> AICar , ManualCar 인스턴스를 달리 생성했을때 동작하는 방식 처럼
*
*   상위 클래스를 상속받은 하위 클래스에서 템플릿 메서드를 재정의 하면 안된다.
*   따라서 final을 사용해 재정의 할 수 없도록 지정한다.
*
*   static final = 상수
*
* */
