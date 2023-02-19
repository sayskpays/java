package ch18.data_io.string_io_stream.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {

        try {
            Reader reader = null;
            // 한 문자씩 읽기
            reader = new FileReader("C:/Temp/test.txt"); // 텍스트 파일로부터 문자 입력 스트림 생성
            while (true){
                int data = reader.read(); // 한 문자를 읽음
                if (data == -1) break;
                System.out.println((char) data);
            }
            reader.close();

            // 문자 배열로 읽기
            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100]; // 읽은 문자를 저장할 배열 생성
            while (true){
                int num = reader.read(data); // 읽은 문자는 배열에 저장, 읽은 문자 수는 리턴
                if (num == -1) break;
                for (int i=0; i<num; i++){
                    System.out.println(data[i]); // 읽은 문자 수 만큼 출력
                }
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
