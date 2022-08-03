package com.array;

public class ArrayAlonePractice {

    private int studentID;
    private String name;

    private static int i = 1000;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayAlonePractice(String name) {
        // 만약 i값을 static으로 주지 않으면 인스턴스를 생성할때마다 값이 초기화 된다. 그래서 모든 i 값이 1001로 출력
        i++;
        this.studentID = i;
        this.name = name;
    }

    public void showStudentInfo(){
        System.out.println("학생아이디:"+this.studentID + "," + "학생 이름" + this.name);
    }
}
