package ch16.lambda_expressions.method_refer;

public class MethodReferenceExample {
    public static void main(String[] args) {

        Person person = new Person();

        // 정적 메소드일 경우
        // person.action(((x, y) -> Computer.staticMethod(x, y)));

        person.action(Computer::staticMethod);

        // 인스턴스 메소드일 경우
        Computer com = new Computer();
        // person.action((x, y) -> com.instanceMethod(x, y));
        person.action(com :: instanceMethod);
    }
}
