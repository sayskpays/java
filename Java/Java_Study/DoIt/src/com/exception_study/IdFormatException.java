package com.exception_study;

public class IdFormatException extends Exception{

    // Constructor
    public IdFormatException(String message){ // String message : 예외 상황 메세지
        super(message);
        /*  Exception 클래스에서 메세지 생성자, 멤버 변수와 메서드를 이미 제공
        *   super(message)를 사용하여 예외 메세지를 설정한다.
        *   나중에 getMessage() 메서드를 호출하면 메세지 내용을 볼 수 있다.
        * */
    }


}
