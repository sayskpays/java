package com.static_study;

public class StaticGetSet {


    // 멤버 변수
    private static int score = 1000;
    int studentID;


    // Constructor
    public StaticGetSet() {
        score++;
        this.studentID = score;
    }

    // static Getter & Setter
    public static int getScore() {
        // 지역 변수
        int i = 10;

        // static method 안에 인스턴스 변수를 사용할 수는 없다.
        // studentID = "hong";

        return score;
    }

    public static void setScore(int score) {
        StaticGetSet.score = score;
    }
}
