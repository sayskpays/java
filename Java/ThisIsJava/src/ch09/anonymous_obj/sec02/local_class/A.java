package ch09.anonymous_obj.sec02.local_class;

public class A {

    // Constructor
    A(){
        // 로컬 클래스 선언
        class B{
        }

        // 로컬 객체 생성
        B b = new B();
    }

    // Method
    void useB(){
        // 로컬 클래스 선언
        class B{

            // method

            void method1(){

            }
        }

        // 로컬 객체 생성
        B b = new B();
    }

    public void method1(int arg){ // final int age
        // 로컬 변수
        int var = 1; // final int var = 1;

        // 로컬 클래스
        class B{
            // 메소드
            void method2(){
                // 로컬 변수 읽기
                System.out.println("arg : " + arg); // (o)
                System.out.println("var :"+ var); // (o)

                // arg = 2; (x)
                // var = 2; (x)
            }
        }
        // 로컬 객체 생성
        B b = new B();
        // 로컬 객체 메소드 호출
        b.method2();



    }

}
