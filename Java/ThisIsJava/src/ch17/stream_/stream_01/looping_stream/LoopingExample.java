package ch17.stream_.stream_01.looping_stream;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        // 잘못된 코드
        Arrays.stream(intArr)
                .filter(a-> a%2==0)
                .peek(n -> System.out.println(n));// 최종 처리가 없으므로 동작하지 않음

        int total = Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(n-> System.out.println(n))
                .sum(); // 최종처리
        System.out.println("총합"+total);

        // 최종 처리 메소드 forEach()를 이용해서 반복 처리
        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .forEach(n-> System.out.println(n));
    }
}
