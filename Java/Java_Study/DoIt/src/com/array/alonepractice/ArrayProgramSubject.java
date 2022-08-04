package com.array.alonepractice;

import java.util.Arrays;

public class ArrayProgramSubject {

    private String[] subName;
    private int[] score;

    public String[] getSubName() {
        if(subName.length == score.length){
            return subName;
        }else{
            return null;
        }
    }

    public void setSubName(String[] subName) {
        this.subName = subName;
    }

    public int[] getScore() {
        if(subName.length == score.length){
            return score;
        }else{
            return null;
        }
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public ArrayProgramSubject(String[] subName, int[] score) {
        this.subName = subName;
        this.score = score;
    }

    public void showScore(){
        System.out.println
        ("의 각 과목별 점수 : " + Arrays.toString(subName)+":"+ Arrays.toString(score));
    }
}
