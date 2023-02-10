package ch16.lambda_expressions.lambda_ex;

@FunctionalInterface
public interface Calculable {
    // 추상 메소드
    void calculate(int x, int y);
}
