package ch18.data_io.buffered_stream.buffer_string;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
          new FileReader("src/ch18/ReadLineExample.java")
        );

        int lineNo = 1;
        while (true){
            String str = br.readLine(); // 1행을 읽음
            if (str == null) break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close(); // BufferedReader를 닫으면 연결된 FileReader도 닫힘


    }
}
