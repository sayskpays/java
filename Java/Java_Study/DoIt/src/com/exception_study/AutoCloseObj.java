package com.exception_study;

public class AutoCloseObj implements AutoCloseable{

    @Override
    public void close() throws Exception {
        // 시스템 리소스 회수 코드 작성
        System.out.println("리소스가 close() 되었습니다.");
    }

}
