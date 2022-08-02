package com.example;


/*
  생성자를 쓰는 이유.
* 클래스를 처음 만들 때 멤버 변수나 상수를 초기화, 인스턴스가 생성됨과 동시에 변수의 값 저장.
*/
public class Constructor {


    String name,address;
    int age,birth;

    public Constructor(String name, String address, int age, int birth) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.birth = birth;
    }

    // 생성자 오버로드
    public Constructor(String name){
        this.name = name;
    }
    public Constructor(int age){
        this.age = age;
    }
}
