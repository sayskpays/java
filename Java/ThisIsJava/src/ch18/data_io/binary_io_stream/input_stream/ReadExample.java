package ch18.data_io.binary_io_stream.input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("C:/Temp/test1.db");

            while (true){
                try {
                    int data = is.read(); // 1바이트씩 읽기

                    if(data == -1) break;
                    System.out.println(data);
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
