package com.interface_study.implements_extends;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();

        shelfQueue.enQueue("x1");
        shelfQueue.enQueue("x2");
        shelfQueue.enQueue("x3");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());




    }
}
