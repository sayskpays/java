package com.array.correct;

import java.util.ArrayList;

public class ArrayProgramVO {

    int studentID;
    String studentName;
    ArrayList<ArrayProgramSubject> subjectList;

    public ArrayProgramVO(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<ArrayProgramSubject>();
    }

    public void addSubject(String name, int score){
        ArrayProgramSubject subject = new ArrayProgramSubject();
        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total = 0;
        for(ArrayProgramSubject s : subjectList){
            total += s.getScore();
            System.out.println("학생"+studentName+"의"+s.getName()+"과목" +
                    "성적은"+s.getScore()+"입니다.");
        }
        System.out.println("학생"+studentName+"의 총점은"+total+"입니다.");

    }


}
