package com.array;

/*

System.arraycopy(src, srcPos, dest, destPos, length)

1. scr : 복사할 배열 이름
2. srcPos : 복사할 배열의 첫 번째 위치
3. dest : 복사해서 붙여 넣을 대상 배열 이름
4. destPos : 복사해서 대상 배열에 붙여 넣기를 시작할 첫 번째 위치
5. length : src에서 dest로 자료를 복사할 요소 개수

[!] 이때 복사할 대상 배열의 전체 길이가 복사할 요소 개수보다 작다면 오류가 난다.

 */

public class ArrayCopy {

    public static void main(String[] args) {

        int[] array1 = {10,20,30,40,50};
        int[] array2 = {1,2,3,4,5};

        System.arraycopy(array1,0,array2,1,4);

        for(int a : array2){
            System.out.println(a);
        }

        for(int i=0; i<array2.length;i++){
            System.out.println(array2[i]);
        }

    }


}

