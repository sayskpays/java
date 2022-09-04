package com.jdk_study.alone;

public class MydateTest {
    public static void main(String[] args) {

        Mydate date1 = new Mydate(9,18,2004);
        Mydate date2 = new Mydate(9,18,2004);

        System.out.println(date1.equals(date2));

    }
}
