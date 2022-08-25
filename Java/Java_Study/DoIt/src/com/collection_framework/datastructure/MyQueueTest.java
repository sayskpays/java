package com.collection_framework.datastructure;

public class MyQueueTest {
    public static void main(String[] args) {

        // FIFO
        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}
