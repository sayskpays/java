package com.staticstudy;

public class StaticGetSetTest {
    public static void main(String[] args) {
        StaticGetSet student = new StaticGetSet();

        System.out.println(StaticGetSet.getScore());
        System.out.println(student.studentID);


        StaticGetSet student2 = new StaticGetSet();

        System.out.println(StaticGetSet.getScore());
        System.out.println(student2.studentID);

    }
}

