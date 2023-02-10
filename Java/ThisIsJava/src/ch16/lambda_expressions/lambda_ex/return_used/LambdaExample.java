package ch16.lambda_expressions.lambda_ex.return_used;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        //리턴문이 하나만 있을 경우(연산식)
        person.action((x, y) -> (x + y));

        // 리턴문이 하나만 있을 경우(메소드 호출)
        person.action(((x, y) -> sum(x, y)));
    }

    public static double sum(double x, double y){
        return (x + y);
    }
}
