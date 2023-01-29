package ch12.obj_class.string;

import java.util.Arrays;

public class ByteToStringExample {
    public static void main(String[] args) throws Exception{
        String data = "자바";

        // String -> byte 배열(default UTF-8)
        byte[] arr1 = data.getBytes();
        System.out.println(Arrays.toString(arr1));

        // byte 배열 -> String (default UTF-8)
        String str1 = new String(arr1);
        System.out.println(str1);

        byte[] arr2 = data.getBytes("EUC-KR");
        System.out.println(Arrays.toString(arr2));

        String str2 = new String(arr2, "EUC-KR");
        System.out.println(str2);

    }
}
