package ch09.anonymous_obj.sec02.outter_member_access;

public class A {

    // A의 인스턴스 필드와 메소드
    int field1;
    void method1(){}

    // A의 정적 필드와 메소드
    static int field2;
    static void method2(){}

    // 인스턴스 멤버 클래스
    class B{
        void method(){
            // A의 인스턴스 필드와 메소드 사용
            field1 = 10;
            method1();
        }
    }
}
