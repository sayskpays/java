package com.staticstudy;

public class StaticVariable {

    // static 변수는 인스턴스 생성과 상관 없이 먼저 생성됨
    // 쉽게 말해 new로 인스턴스를 생성할때 초기화 되지 않게 하기 위해서는 static을 붙여야 한다.
    // static은 변수, 메소드에 붙을 수 있고 메소드에 붙을 경우 return 값에 static 변수만 올 수 있다.
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
