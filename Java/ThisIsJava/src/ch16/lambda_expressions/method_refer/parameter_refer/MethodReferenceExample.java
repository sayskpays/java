package ch16.lambda_expressions.method_refer.parameter_refer;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        // (a, b) -> a.compareToIgnoreCase(b);
        person.ordering(String :: compareToIgnoreCase);
    }
}
