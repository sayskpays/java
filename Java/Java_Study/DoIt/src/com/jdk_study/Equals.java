package com.jdk_study;

public class Equals {


    /*
    *   equals() 메서드는 Overriding을 통해서 논리적으로 같은 인스턴스인지 확인하도록 구현 가능
    *
    * */




    public static void main(String[] args) {
        Book a = new Book(1,"a");
        Book b = a; // 주소 복사

        Book c = new Book(1,"a"); // a와 c는 서로 다른 물리적 동일성은 없지만 논리적 동일성은 가진다.


        if(a == b){
            System.out.println("a와 b의 주소는 같습니다.");
        }else{
            System.out.println("a와 b의 주소는 다릅니다.");
        }

        if(a.equals(b)){
            System.out.println("a와 b는 동일합니다.");
        }else{
            System.out.println("a와 b는 동일하지 않습니다.");
        }


        if(a==c){
            System.out.println("a와 b주소는 같습니다.");
        }else{
            System.out.println("a와 c주소는 다릅니다.");
        }

        if(a.equals(c)){
            System.out.println("a와 c는 동일합니다.");
        }else{
            System.out.println("a와 c는 동일하지 않습니다");
        }

        //객체는 equals여도 논리적 주소도 다르다고 나옴 하지만 String, Integer 타입은 같다고 나온다. =? equals 메서드가 재정의 되어 있기 때문




    }
}
