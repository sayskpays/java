package ch09.anonymous_obj.sec02.instance_member_class;

public class A {
    // Field

    // 인스턴스 멤버 클래스
    class B {
        // B Field
        int field1 = 1;
        // B Constructor
        B(){
            System.out.println();
        }
        // B Method
        void method1(){
            System.out.println();
        }

    }

    // 인스턴스 필드 값으로 B 객체 대입
    B field = new B();

    // Constructor

    A(){
        B b = new B();
    }

    // Method

    void useB(){
        B b = new B();
        System.out.println(b.field1);
        b.method1();
    }
}
