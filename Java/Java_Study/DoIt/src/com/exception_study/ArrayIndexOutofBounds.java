package com.exception_study;

public class ArrayIndexOutofBounds {
    public static void main(String[] args) {

        int[] arr = new int[5];



        try {
            for(int i=0; i<=5; i++){
                arr[i] = i;
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("시스템 종료");
    }
}
