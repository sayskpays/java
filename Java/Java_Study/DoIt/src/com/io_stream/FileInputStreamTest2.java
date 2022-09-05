package com.io_stream;

import java.io.FileInputStream;
import java.io.IOException;

/*
FileInputStream
파일 끝까지 읽기
한 바이트씩 읽기
*/
public class FileInputStreamTest2 {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("input.txt")){
            int i;
            while((i = fis.read()) != -1){ // i 값이 -1이 아닌 동안 read() 메서드로 한 바이트를 반복해 읽음
                                            // read() 메서드로 파일을 읽는 경우 파일 끝에 도달하면 -1 반환
                System.out.println((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
