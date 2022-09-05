package com.io_stream;

import java.io.FileInputStream;
import java.io.IOException;

/*

한 바이트씩 읽지 않고 선언한 바이트 배열의 크기 만큼 한꺼번에 자료를 읽는다.
그리고 읽어 들인 자료의 수를 반환한다.

*/


public class FileInputStreamTest3 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("input2.txt")) {
            byte[] bs = new byte[10];
            int i;

            while((i = fis.read(bs)) != -1){
                for(byte b : bs){
                    System.out.println((char)b);
                } // 전체 배열 출력

                for(int k = 0; k < i; k++){
                    System.out.println((char)bs[k]);
                }// i 개수만큼 출력
                System.out.println(": "+ i +"바이트 읽음");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
