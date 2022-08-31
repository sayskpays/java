package com.stream_study;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        String[] stArr = {"1","2","3","4","5"};


        // 1
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        // 2
        Arrays.stream(arr).forEach(n -> System.out.println(n));


        /*중간 연산*/

        // filter
        Arrays.stream(stArr).filter(st -> st.length() >= 5).forEach(st -> System.out.println(st));

        // map
        //Arrays.stream(stArr).filter(st -> st.getStArr()).forEach(st -> System.out.println(st));

        /* 최종 연산 */
        int sumVal = Arrays.stream(arr).sum(); // sum() 연산으로 arr 배열에 저장된 값을 모두 더함
        int count = (int)Arrays.stream(arr).count(); // count() 연산으로 arr 배열의 요소 개수를 반환함
        // count() 메서드의 반환 값이 long이므로 int형으로 변환


        /* Collection에서 스트림 생성하고 사용하기 */

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Tomas1");
        sList.add("Tomas2");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s)); // forEach() : 내부적으로 반복문 수행
                                                    // forEach() 메서드가 수행되면 하나씩 차례대로 변수 s에 대입되고 이를 매개변수로 받아 출력문이 호출
                                                    // forEach() 최종 연산을 하였기 때문에 자료 소모

        Stream<String> stream2 = sList.stream();
        stream2.sorted().forEach(s-> System.out.println(s));


        /* reduce() 메서드 사용 */

        Arrays.stream(arr).reduce(0,(a,b)->a + b);






    }
}
