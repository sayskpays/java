package com.collection_framework.datastructure;

import java.util.ArrayList;

public class MyQueue {

    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data){
        arrayQueue.add(data);
    }

    public String deQueue(){
        int len = arrayQueue.size();
        if(len==0){
            System.out.println("쿠가 비었습니다.");
            return null;
        }
        return(arrayQueue.remove(0)); // 맨 앞의 자료 반환하고 배열에서 제거
    }
}
