package com.inner_class;

class OutClass{
    //filed
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass; // OutClass에서 InnerClass Instance 생성
    //constructor

    public OutClass() {
        inClass = new InClass(); // 외부 클래스를 생성할때 내부 클래스의 인스턴스도 만들어 버림
    }
    //method

     class InClass{
        int inNum = 100;
        int sInNum = 200;

        void inTest(){

        }
        void sTest(){

        }

        public void usingClass(){
            inClass.inTest(); //
        }
    }
}


public class InstanceInnecrClass {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();

        System.out.println(outClass);
    }

}
