package com.jdk_study;

/*
*   매개변수가 Object거나 반환 값이 Object인 경우
*
*   Ex) public void setValue(Integer i)
*       public Integer returnValue()
*
*   기본형     Wrapper 클래스
*   boolean     Boolean
*   byte        Byte
*   char        Character
*   short       Short
*   int         integer
*   long        Long
*   float       Float
*   double      Double
*
*
*
* */

public class Wrapper {
    // Integer 클래스로 반환
    Integer number = Integer.valueOf("100");
    // 문자열 -> int값
    int num = Integer.parseInt("100");

}
