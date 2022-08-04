package com.array;

public class TwoDementionalArrayPractice {
    public static void main(String[] args) {

        char ch = 'A';
        char[] oneArray = new char[26];
        char[][] twoArray = new char[13][2];

        // 1차원 배열 구현
//        for(int i=0; i<oneArray.length; i++, ch++){
//            oneArray[i] = ch;
//            System.out.println(oneArray[i]);
//        }

        ////////////////////////////////

        // 2차원 배열 구현
        // twoArray.length == 행 길이
        for(int i=0; i<twoArray.length; i++){
            // 2차원 배열 안에서 증감식에 ch++을 할 경우 2차원 배열에 바로 대입할 수 있다.
            // twoArray[i].length == 열 길이
            for(int j=0; j<twoArray[i].length; j++, ch++){
                twoArray[i][j] = ch;
                System.out.print(twoArray[i][j]);
            }
            System.out.println();
        }



    }
}
