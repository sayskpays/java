package com.collection_framework.practice.arraylist;

import com.collection_framework.practice.MemberVO;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList list = new MemberArrayList();

        MemberVO memberHong = new MemberVO(1001,"홍준수");
        MemberVO memberJun = new MemberVO(1002,"준수");
        MemberVO memberSoo = new MemberVO(1003,"수");
        MemberVO member = new MemberVO(1004,"새로운사람");

        list.addMember(memberHong);
        list.addMember(memberJun);
        list.addMember(memberSoo);
        list.indexAddMember(1,member);
        list.showAllMember();

        list.removeMember(memberHong.getMemberId());
        list.showAllMember();


    }
}
