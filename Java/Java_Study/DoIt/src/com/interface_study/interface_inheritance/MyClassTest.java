package com.interface_study.interface_inheritance;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.x();
        myClass.y();
        myClass.myMethod();

        MyInterface iClass = myClass;
        iClass.x();
        iClass.y();
        iClass.myMethod();


    }
}
