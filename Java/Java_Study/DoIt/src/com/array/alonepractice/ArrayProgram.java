package com.array.alonepractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProgram {

    public static void main(String[] args) {

        ArrayProgramSubject sub1 = new ArrayProgramSubject(new String[]{"국어","수학"},new int[]{100,50});
        ArrayProgramSubject sub2 = new ArrayProgramSubject(new String[]{"국어","수학","영어"},new int[]{70,85,100});

        // 배열의 주소값이 출력될때 Arrays.toString으로 출력하면 된다.
        //System.out.println(Arrays.toString(sub1.getSubName()));
        //System.out.println(Arrays.toString(sub1.getScore()));

        ArrayList<ArrayProgramVO> test1 = new ArrayList<>();
        test1.add(new ArrayProgramVO("Lee",sub1.getSubName()));
        test1.add(new ArrayProgramVO("Kim",sub2.getSubName()));

        for(ArrayProgramVO show : test1){
            // 과목 성적을 출력하는 부분에서 막힘
            System.out.println("학생"+show.getStudentID() + show.getName()+ "의" + Arrays.toString(show.getSub())+"과목 성적은 각각"+ Arrays.toString(show.showScore(new ArrayProgramSubject[]{sub1, sub2})));
        }
    }

}
