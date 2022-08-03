package com.array;

public class TwoDementionalArray {
    public static void main(String[] args) {

        // [행 개수][열 개수]
        int[][] t = new int[2][3];
        int[][] arr = {{1,2,3},{4,5,6}};

        // arr.length 행 숫자
        // arr[i].length 열 숫자
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.println(arr[i].length);
                //System.out.println(arr[i][j]);
            }
        }
        System.out.println(arr.length);

        for(int[] a : arr){
            for(int b : a){
                //System.out.println(b);
            }
            System.out.println();
        }
    }
}
