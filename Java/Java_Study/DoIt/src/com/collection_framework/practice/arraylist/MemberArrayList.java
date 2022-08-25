package com.collection_framework.practice.arraylist;

import com.collection_framework.practice.MemberVO;
import java.util.ArrayList;
import java.util.Collections;

public class MemberArrayList {

    // Field
    private ArrayList<MemberVO> arrayList;


    // Constructor
    public MemberArrayList() {
        arrayList = new ArrayList<MemberVO>();
        Collections.synchronizedList(arrayList);
    }

    // Method
    public void addMember(MemberVO vo){
        arrayList.add(vo);
    }

    public void indexAddMember(int index ,MemberVO vo){
        arrayList.add(index,vo);
    }

    public boolean removeMember(int memberId){
        for(int i=0; i<arrayList.size(); i++){
            MemberVO member = arrayList.get(i); // 회원을 순차적으로 가져옴
            int tempId = member.getMemberId();

            if(tempId == memberId){
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(MemberVO vo : arrayList){
            System.out.println(vo);
        }
        System.out.println();
    }
}
