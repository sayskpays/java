package com.lambda;

public class LambdaTest {
    public static void main(String[] args) {

        int i = 100;

        MyNumber max = (x,y) -> {
            if(x >= y)
                return x;
            else return y;
            };

        MyNumber max1 = (x,y) -> (x >= y) ? x : y;

        System.out.println(max.getMax(10,20));

        showRe(max1);

    }
    public static void showRe(MyNumber m){
        System.out.println(m.getMax(10,30));
    }

}
