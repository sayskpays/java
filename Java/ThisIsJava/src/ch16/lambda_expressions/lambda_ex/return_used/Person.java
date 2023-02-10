package ch16.lambda_expressions.lambda_ex.return_used;

public class Person {
    public void action(Calcuable calcuable){
        double result = calcuable.cal(10, 4);
        System.out.println(result);
    }
}
