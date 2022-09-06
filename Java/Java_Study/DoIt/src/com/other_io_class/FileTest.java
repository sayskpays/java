package com.other_io_class;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args)throws IOException {
        File file = new File("C:\\hong"); // 해당 경로에 File 클래스 생성 아직 실제 파일이 생성된 것은 아님
        file.createNewFile(); // 실제 파일 생성

        System.out.println(file.isFile()); // boolean
        System.out.println(file.isDirectory()); // boolean
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead()); // boolean
        System.out.println(file.canWrite()); // boolean

        file.delete(); // 파일 삭제
    }

}
