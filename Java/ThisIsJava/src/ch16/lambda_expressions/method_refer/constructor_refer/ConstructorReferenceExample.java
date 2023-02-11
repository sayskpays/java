package ch16.lambda_expressions.method_refer.constructor_refer;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 여기서 a는 Creatable1의 String id 값
        Member m1 = person.getMember1((a)->{return new Member(a);});
        Member m2 = person.getMember1(Member :: new);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println();


        Member m3 = person.getMember2((a, b)->{return new Member(a, b);});
        Member m4 = person.getMember2(Member :: new);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println();

    }
}
