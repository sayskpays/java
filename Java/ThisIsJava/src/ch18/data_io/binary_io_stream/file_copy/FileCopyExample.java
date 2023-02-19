package ch18.data_io.binary_io_stream.file_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyExample {
    public static void main(String[] args) throws Exception{
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data = new byte[1024]; // 읽은 바이트를 저장할 배열 생성
        while (true){
            int num = is.read(data); // 최대 1024 바이트를 읽고 배열에 저장, 읽은 바이트는 리턴
            if (num == -1)break;
            os.write(data, 0, num); // 읽은 바이트 수만큼 출력
        }

        os.flush(); // 내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
        os.close();
        is.close();

    }
}
