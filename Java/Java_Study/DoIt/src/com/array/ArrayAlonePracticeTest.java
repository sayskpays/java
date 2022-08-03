package com.array;

public class ArrayAlonePracticeTest {

    public static void main(String[] args) {

        ArrayAlonePractice[] test = new ArrayAlonePractice[3];

        for(int i=0; i<test.length; i++){
            test[i] = new ArrayAlonePractice("hong"+i);
            test[i].showStudentInfo();
        }

    }
}
