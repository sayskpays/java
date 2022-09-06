package com.io_stream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* Buffered 스트림을 사용할때와 그렇지 않을때 수행 시간 비교
 *
 * a.zip 파일을 복사해 copy.zip을 만드는 로직
 *
 * */
public class FileCopyTest {
    public static void main(String[] args) {
        long millisecond = 0;
        try (FileInputStream fis = new FileInputStream("a.zip");
             FileOutputStream fos = new FileOutputStream("copy.zip")) {

            millisecond = System.currentTimeMillis();
            int i;
            while((i = fis.read()) != -1){
                fos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
