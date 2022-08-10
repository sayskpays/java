package com.jdk_study;


import java.util.ArrayList;
import java.util.Arrays;

class Book{
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

}


public class ToString {
    public static void main(String[] args) {
        Book book = new Book(200, "개미");

        System.out.println(book.toString());

        String str = new String("test");
        System.out.println(str);
        Integer i = new Integer(100);
        System.out.println(i);
        
        String[] ab = {"a","b"};
        System.out.println(Arrays.toString(ab));



    }
}
