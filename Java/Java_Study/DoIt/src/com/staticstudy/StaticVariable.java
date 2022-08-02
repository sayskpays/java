package com.staticstudy;

public class StaticVariable {

    // static 변수는 인스턴스 생성과 상관 없이 먼저 생성됨
    public static int seriaNum = 100;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    // 학생 한 명이 생성될때마다 학번을 자동으로 부여하는 코드
    public StaticVariable(){
        seriaNum++;
        this.studentID = seriaNum;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


}
