package ch16.lambda_expressions.method_refer;

public class Person {
    public void action(Calcuable calcuable){
        double result = calcuable.calc(10, 4);
        System.out.println(result);
    }
}
