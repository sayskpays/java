package com.array.correct;

public class ArrayProgram {

    public static void main(String[] args) {
        ArrayProgramVO studentHong = new ArrayProgramVO(1001,"Hong");
        studentHong.addSubject("국어",100);
        studentHong.addSubject("수학",50);

        studentHong.showStudentInfo();

    }

}
