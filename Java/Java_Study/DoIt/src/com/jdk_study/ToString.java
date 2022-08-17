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

    // toString() 메서드 Overriding
    @Override
    public String toString(){
        return bookTitle + "," + bookNumber;
    }

    // equals Overriding
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Book){
            Book book = (Book)obj;
            if(this.bookNumber == book.bookNumber){
                return true;
            }
            else return false;
        }

        return false;
    }

    @Override
    public int hashCode(){
        return bookNumber;
    }


}

public class ToString {
    public static void main(String[] args) {
        Book book = new Book(200, "개미");
        Book book2 = new Book(200, "개미");

        System.out.println(book.toString());

        String str = new String("test");
        System.out.println(str);
        Integer i = new Integer(100);
        System.out.println(i);

//        String[] ab = {"a","b"};
//        System.out.println(Arrays.toString(ab));


        System.out.println("////////////////////////////////////////////////////////////");

        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());

        // 재정의를한 (HashCode 힙 메모리 주소를 출력)
        System.out.println(System.identityHashCode(book));
        System.out.println(System.identityHashCode(book2));





    }
}
