package com.array.alonepractice;

public class ArrayProgramVO {

    private int studentNum;
    private String name;
    private String[] sub;
    private static int id = 1000;

    public ArrayProgramVO(String name, String[] sub) {
        id++;
        this.studentNum = id;
        this.name = name;
        this.sub = sub;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSub() {
        return sub;
    }

    public void setSub(String[] sub) {
        this.sub = sub;
    }

    public int[] showScore(ArrayProgramSubject[] a ){
        if(a != null){
            for(ArrayProgramSubject test :a){
                return test.getScore();
            }
        }
        return new int[0];
    }
}
