package ch18.data_io.print_stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception{

        FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.print("마치");
        ps.println("프런티가 출력하는 것 처럼");
        ps.println("데이터를 출력합니다.");
        ps.printf("| %6d | %-10s | %10s | \n", 1, "홍길동", "도적");

        ps.flush();
        ps.close();
    }
}
