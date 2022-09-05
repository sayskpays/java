package com.io_stream;

import java.io.IOException;

public class IoTest {
    public static void main(String[] args) throws IOException {
        System.out.println("알파벳 하나를 쓰고 [Endter]를 누르세요");

        int i;
        try {

            while((i = System.in.read()) != -1){
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
