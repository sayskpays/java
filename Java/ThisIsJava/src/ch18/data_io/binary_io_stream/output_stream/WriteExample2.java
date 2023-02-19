package ch18.data_io.binary_io_stream.output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) {

        try {
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");

            byte[] array = {10, 20, 30};

            os.write(array);

            os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
