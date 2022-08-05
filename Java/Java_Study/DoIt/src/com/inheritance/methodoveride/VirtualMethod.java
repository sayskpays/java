package com.inheritance.methodoveride;

public class VirtualMethod {

    int num;

    private void aaa(){
        System.out.println("aaa() ");
    }

    /*
     *
     *   메서드 -> 메서드 영역에 위치
     *   메서드를 호출할 경우 메서드 영역의 주소를 참조하여 명령 실행
     *   따라서 인스턴스가 달라고 동일한 메서드 출력
     *
     * */
    public static void main(String[] args) {
        VirtualMethod a1 = new VirtualMethod();
        a1.aaa();
        VirtualMethod a2 = new VirtualMethod();
        a2.aaa();


    }

}
