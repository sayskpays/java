package ch17.stream_.stream_01.optional_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        /* 예외 발생(java.util.NoSuchElementException)
        double avg = list.stream()
                //.mapToInt(value -> value.intValue())
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
         */

        // 방법 1
        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer :: intValue)
                .average();
        if (optionalDouble.isPresent()){
            System.out.println("방법 1 평균 : " + optionalDouble.getAsDouble());
        }else{
            System.out.println("방법 1 평균:" + 0.0);
        }

        // 방법 2
        double avg = list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법 2 평균" + avg);

        // 방법 3
        list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .ifPresent(a -> System.out.println("방법 3 평균:" + a));

    }
}
