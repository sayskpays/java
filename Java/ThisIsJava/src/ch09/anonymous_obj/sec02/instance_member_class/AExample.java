package ch09.anonymous_obj.sec02.instance_member_class;

public class AExample {
    public static void main(String[] args) {
        A a = new A();

        // B 객체 생성
        A.B b = a.new B();


        // A 인스턴스 메소드 호출 (B 멤버 클래스 메소드 사용)
        a.useB();
    }
}
