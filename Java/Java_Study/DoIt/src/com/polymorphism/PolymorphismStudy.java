package com.polymorphism;


/*
    다형성은 추상 클래스, 인터페이스에서 구현

    다형성 : 하나의 코드가 여러 자료형으로 구현되어 실행 되는 것
    같은 코드에서 여러 실행 결과가 나오는 것
*?
 */


class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 걷습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class PolymorphismStudy {
    public static void main(String[] args) {
        PolymorphismStudy test = new PolymorphismStudy();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());
        test.moveAnimal(new Animal());

    }// main method

    // 매개변수의 자료형이 상위 클래스(부모 클래스)
    public void moveAnimal(Animal animal){
        // Animal의 move 메서드가 아닌 매개변수로 넘어온 실제 인스턴스의 메서드를 호출한다.
        // animal.move()코드는 변함이 없지만 어떤 매개변수가 넘어왔느냐에 따라 출력문이 달라진다.
        animal.move();
    }//method

}// main class
