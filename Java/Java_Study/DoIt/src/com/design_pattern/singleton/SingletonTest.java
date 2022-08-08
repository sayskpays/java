package com.design_pattern.singleton;

public class SingletonTest {


    public static void main(String[] args) {

        // 단계4. 실제로 사용하는 코드 만들기
        Singleton test1 = Singleton.getInstance();
        Singleton test2 = Singleton.getInstance();

        // 같은 주소의 인스턴스 출력
        System.out.println(test1==test2);
    }
}
