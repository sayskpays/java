package com.exception_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {

    // method
    public Class loadClass(String fileName , String className) throws FileNotFoundException, ClassNotFoundException{
        // throws FileNotFoundException, ClassNotFoundException : 두 예외를 메서드가 호출될 때 처리하도록 미룸 -> main()에서 실행되니
        // main()으로 미룸

        FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생 가능
        Class c = Class.forName(className); // ClassNotFoundException 발생 가능

        return c;
    }

    public static void main(String[] args) {
        ThrowsExceptionTest test = new ThrowsExceptionTest();
        try {
            test.loadClass("a.text", "java.lang.String");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
