package com.collection_framework.map_interface;

import com.collection_framework.practice.MemberVO;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, MemberVO> treeMap;

    public MemberTreeMap(){
        treeMap = new TreeMap<>();
    }

    public void addMember(MemberVO member){
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        if(treeMap.containsKey(memberId)){
            treeMap.remove(memberId);
            return true;
        }
        System.out.println(memberId+"가 존재하지 않습니다");
        return false;
    }

    public void showAllMembers(){
        Iterator<Integer> ir = treeMap.keySet().iterator();

        while ((ir.hasNext())){
            int key = ir.next();
            MemberVO member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
