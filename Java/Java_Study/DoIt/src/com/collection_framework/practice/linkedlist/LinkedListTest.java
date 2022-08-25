package com.collection_framework.practice.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<>();

        linkList.add("A");
        linkList.add("B");
        linkList.add("C");

        System.out.println(linkList);

        linkList.add(1,"D");
        System.out.println(linkList);

        linkList.addFirst("0");

        System.out.println(linkList);

        System.out.println(linkList.removeLast()); // 연결 리스트의 맨 뒤 요소 삭제 후 해당 요소를 출력
        System.out.println(linkList);

    }
}
