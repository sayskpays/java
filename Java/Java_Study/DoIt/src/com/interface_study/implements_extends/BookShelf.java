package com.interface_study.implements_extends;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue{

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0); // 배열 요소를 맨 앞거를 반환하고 삭제
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
