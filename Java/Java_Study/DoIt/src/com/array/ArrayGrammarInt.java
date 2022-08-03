package com.array;


/*
향상 for문 동작 방싱

*   for( int i=0; i<array.length; i++)
하고
for(int i:array)
는 아예 다른 동작을 합니다.
앞의 반복문은 i값이 0, 1, 2, 3, 4 순으로 바뀝니다.
뒤의 반복문은 i값이 1, 5, 3, 8, 2 순으로 바뀝니다.
뒤의 반복문이 다른 점은, i값에 배열의 값 자체가 들어간다는 겁니다.

Array의 값을 단순히 빼내서 쓸 때 향상 for문 사용.

순차적으로 증가하여 반복문을 돌릴때는 일반 for문 사용
*
*
*
* */

public class ArrayGrammarInt {
    public static void main(String[] args) {
        int[] arrayTest = new int[3];
        int[] arrayTest1 = {1,2,3,4,5,6,7,8,9,10};

        arrayTest[0] = 10;

        /* 일반적으로 9번 반복일 경우 i<=9 보다는 i<10을 사용하는게 좋다*/
        for(int i=0;i<arrayTest1.length;i++){
            System.out.println(i); //9번 반복 0~9 출력 (반복횟수 출력)
            System.out.println(arrayTest1[i]);
        }

        // 위의 코드와 동일한 값 출력
        for(int a : arrayTest1){
            System.out.println(a);
        }

        // 배열 모든 합 출력
        int sum = 0 ;
        for(int b : arrayTest1){
            sum += b;

        }
        System.out.println(sum);



    }
}
