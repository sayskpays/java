package com.other_io_class;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

        rf.writeInt(100);// int 4 바이트
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer()); // 파일 포인터 위치를 반환하는 메서드
        rf.writeDouble(3.14);// double 8 바이트
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer()); // 파일 포인터 위치를 반환하는 메서드
        rf.writeUTF("안녕하세요");// 수정된 UTF-8 한글(3바이트) * 5 + null 문자(2바이트) = 17
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer()); // 파일 포인터 위치를 반환하는 메서드 == 29

        rf.seek(0); // 0으로 포인터 이동

        int i = rf.readInt(); // 여기서 오류 발생 : 파일 포인터 위치가 29에 있기 때문 , 읽어야 할 파일 위치는 맨 처음인 0부터 때문에 위에 rf.seek(0) 코드 추가
        double d = rf.readDouble();
        String str = rf.readUTF();



        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

    }
}
