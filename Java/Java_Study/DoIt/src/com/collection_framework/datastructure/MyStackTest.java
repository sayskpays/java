package com.collection_framework.datastructure;

public class MyStackTest {
    public static void main(String[] args) {

        //LIFO
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
