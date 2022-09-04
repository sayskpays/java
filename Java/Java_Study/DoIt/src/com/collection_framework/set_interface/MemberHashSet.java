package com.collection_framework.set_interface;

import com.collection_framework.practice.MemberVO;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<MemberVO> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(MemberVO vo){
        hashSet.add(vo);
    }

    public boolean removeMember(int memberId){

        Iterator<MemberVO> ir = hashSet.iterator(); // Iterator를 활용해 순회함

        while(ir.hasNext()){
            MemberVO vo = ir.next(); // 회원을 하나씩 가져옴
            int tempId = vo.getMemberId();
            if(tempId == memberId){
                hashSet.remove(vo);
                return true;
            }
        }
        return false;
    }

    public void showAllMember(){
        for(MemberVO vo : hashSet){
            System.out.println(vo);
        }
        System.out.println();
    }


}
