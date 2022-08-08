package com.inheritance.downcasting;


import java.util.ArrayList;

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
    public void readBook(){
        System.out.println("책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }
    public void attack(){
        System.out.println("호랑이가 공격합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void search(){
        System.out.println("독수리가 사냥감을 찾습니다.");
    }
}

public class DownCastingTest {

    // Field
    ArrayList<Animal> aniList = new ArrayList<>();

    // Constructor



    // Method

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parent = "hong";

        // Child 인스턴스 -> Parent로 형 변환
        // Child 인스턴스의 멤버 변수, 인스턴스를 사용할 수 없다.
        Parent parentChild = new Child();
        parentChild.parent = "jun";

        // instanceof : 오른쪽에 있는 참조 변수의 원래 인스턴스형이 오른쪽 클래스 자료형인가 확인
        if(parentChild instanceof Child){
            Child childCast = (Child)parentChild;
            childCast.child = "su";
        }


        Child child = new Child();
        child.child = "soo";

        ///////////////////////////////////////////////////////////////////////////////////////////////////
        DownCastingTest dTest = new DownCastingTest();

        dTest.addAnimal(); // List에 객체 담기
        System.out.println("원래 형으로 다운 캐스팅");
        dTest.testCasting();

    }//main

    public void addAnimal(){
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for(Animal ani : aniList){
            ani.move();
        }

    }// addAnimal : ArrayList에 객체 담기


    public void testCasting(){
        for(int i=0; i<aniList.size(); i++){
            Animal ani = aniList.get(i);

            if(ani instanceof Human){
                Human h = (Human) ani;
                h.readBook();
            }else if(ani instanceof Tiger){
                Tiger t = (Tiger) ani;
                t.attack();
            }else if(ani instanceof Eagle){
                Eagle e = (Eagle) ani;
                e.search();
            }else{
                System.out.println("다운캐스팅을 할 수 없습니다.");
            }
        }
    }// testCasting

}// class


/*  부모                  자식
*   Animal() test = new Human();
*
*   test 참조 변수는 Animal의 멤버 변수, 메소드 밖에 사용하지 못한다.
*   하지만 자식 클래스에서 오버라이딩한 메소드를 사용할 경우 자식것이 사용된다.
*
*   즉 Animal의 멤버 변수와 메소드를 사용하고자 할 경우 다운 캐스팅 필요
*
*
* */
