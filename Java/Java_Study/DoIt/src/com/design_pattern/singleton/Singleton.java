package com.design_pattern.singleton;

/*
 *   단 하나의 인스턴스를 생성 하는 것.
 *   ex) Bus test = new Bus();   -- 1
 *
 * */


public class Singleton {

    // Field

    // 단계 2. 클래스 내부에 static으로 유일한 인스턴스 생성하기 : private로 선언하여 외부에서 이 인스턴스에 접근하지 못하도록 설정 !
    private static Singleton instance = new Singleton();

    // Constructor

    // 단계 1. 생성자를 private로 만든다 : 생성자가 public일 경우 외부 클래스에서 인스턴스를 여러 개 생성할 수 있기 때문
    private Singleton() {
    }


    // Method

    // 단계 3. 외부에서 참조할 수 있는 public 메서드 만들기
    // -> private로 선언한 유일한 인스턴스를 외부에서도 사용할 수 있도록 설정
    // 이때 인스턴스를 반환하는 메서드는 반드시 static으로 선언 !
    // getInstance() 메서드는 인스턴스 생성과 상관없이 호출할 수 있어야 하기 때문 (인스턴스 하나만 생성 하는 것이 싱글톤)
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
