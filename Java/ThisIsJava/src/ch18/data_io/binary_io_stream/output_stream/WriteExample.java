package ch18.data_io.binary_io_stream.output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {

        try {
            OutputStream os = new FileOutputStream("C:/Temp/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c); // 1 byte씩 출력

            os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
            os.close(); // 출력 스트림을 닫아 사용한 메모리 해제

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
