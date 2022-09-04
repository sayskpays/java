package com.collection_framework.set_interface;

import com.collection_framework.practice.MemberVO;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<MemberVO> treeSet;

    public MemberTreeSet(){
        treeSet = new TreeSet<>();
    }

    public void addMember(MemberVO vo){
        treeSet.add(vo);
    }

    public boolean removeMember(int memberId){
        Iterator<MemberVO> ir = treeSet.iterator();
        while(ir.hasNext()){
            MemberVO vo = ir.next();
            int temId = vo.getMemberId();
            if(temId == memberId){
                treeSet.remove(vo);
                return true;
            }
        }
        return false;
    }

    public void showAllMember(){
        for(MemberVO vo :treeSet){
            System.out.println(vo);
        }
        System.out.println();
    }
}
