package ch18.data_io.buffered_stream.buffer_binary;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception{

        // 입출력 스트림 생성
        String originalFilePath1 =
                BufferExample.class.getResource("originalFile1.jpg").getPath();
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";

        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        // 입출력 스트림 + 버퍼 스트림 생성
        String originalFilePath2 =
                BufferExample.class.getResource("originalFile2.jpg").getPath();
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        // 버퍼를 사용하지 않고 복사
        long nonBufferTime = copy(fis, fos);

        // 버퍼를 사용하고 복사
        long bufferTime = copy(bis,bos);

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }

    public static long copy(InputStream is, OutputStream os) throws Exception{
        long start = System.nanoTime();

        while (true){
            int data = is.read();
            if (data == -1)break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();

        return end-start;
    }
}
