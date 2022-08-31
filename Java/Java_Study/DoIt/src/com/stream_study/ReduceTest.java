package com.stream_study;


import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s, String s2) {
        if(s.getBytes().length >= s2.getBytes().length) return s;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요", "Hi", "Hello","반갑습니다하하"};

        // BinaryOperator로 구현
        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);

        // reduce() 람다식 구현
        System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)-> {
                    if(s1.getBytes().length >= s2.getBytes().length)
                        return s1;
                    else return s2;
                }));



    }
}
