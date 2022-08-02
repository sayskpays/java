package com.staticstudy;

public class StaticVariableTest {

    public static void main(String[] args) {

        StaticVariable student = new StaticVariable();
        student.setStudentName("hong");
        System.out.println(StaticVariable.seriaNum);
        System.out.println(student.studentID);

        StaticVariable student2 = new StaticVariable();
        student2.setStudentName("hong");
        System.out.println(StaticVariable.seriaNum);
        System.out.println(student2.studentID);

    }
}
