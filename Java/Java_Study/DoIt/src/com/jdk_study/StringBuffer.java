package com.jdk_study;

/*
*   String Class를 사용하여 문자열을 계속 연결하거나 변경하는 프로그램을 작성하면 메모리가 많이 낭비
*   이 문제를 해결하는 것이 StringBuffer와 StringBuilder 클래스
*
*   실행속도 : StringBuilder
*   문자열 안전 변경 보장 : StringBuffer
*
*
*
*
* */

public class StringBuffer {
    public static void main(String[] args) {
        String javaStr = new String("java");
        System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));

        StringBuilder builder = new StringBuilder(javaStr);
        System.out.println("연산 전 builder 메모리 주소 : " + System.identityHashCode(builder));

        builder.append(" and");
        builder.append(" android");
        builder.append(" programing");
        System.out.println("연산 후 builder 메모리 주소 : " + System.identityHashCode(builder));

        javaStr = builder.toString(); // String 클래스로 변환
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));

    }
}
