package com.this_is;

public class CallAnotherConst {

    int age;
    String name;

    // this를 사용해 Person(String, int)생성자 호출
    CallAnotherConst(){
        this("name",1);
    }

    CallAnotherConst(String name, int age){
        this.name = name;
        this.age = age;
    }

    CallAnotherConst returnItSelf(){
        return this;
    }


    public static void main(String[] args) {

        // default 생성자로 인스턴스를 생성할 경우 this를 통해 name과 age가 전달 된다.
        CallAnotherConst test = new CallAnotherConst();
        System.out.println(test.age);
        System.out.println(test.name);

        CallAnotherConst p = test.returnItSelf();
        System.out.println(p);
        System.out.println(test);
    }
}
