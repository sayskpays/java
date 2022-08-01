package com.example;

public class Practice {
    public static void main(String[] args) {
    

        // Operator 값이 +,-,*,/ 인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 switch-case문을 사용해 작성

        int num1 = 10;
        int num2 =2;
        int change;
        char operator = '+';

        // if(operator == '+'){
        //     change = num1 + num2;
        //     System.out.println(change);
        // }else if(operator == '-'){
        //     change = num1 - num2;
        //     System.out.println(change);
        // }else{
        //     System.out.println("결과가 없습니다.");
        // }


        switch(operator){
            case '+': change = num1 + num2;
            System.out.println(change);
            break;

            case '-': change = num1 - num2;
            System.out.println(change);
            break;

            default : System.out.println("결과가 없습니다.");

        }

    }
}
