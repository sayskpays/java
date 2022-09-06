package com.io_stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("writer.txt")) {

            fw.write('A');
            char buf[] = {'b','a','c'};

            fw.write(buf);
            fw.write(buf,1,2);
            fw.write("안녕하세요");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
