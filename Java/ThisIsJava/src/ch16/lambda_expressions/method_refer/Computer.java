package ch16.lambda_expressions.method_refer;

public class Computer {
    public static double staticMethod(double x, double y){
        return x + y;
    }

    public double instanceMethod(double x, double y){
        return x * y;
    }
}
