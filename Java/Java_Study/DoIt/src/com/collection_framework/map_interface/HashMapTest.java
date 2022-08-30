package com.collection_framework.map_interface;

import com.collection_framework.practice.MemberVO;

public class HashMapTest {

    public static void main(String[] args) {
        HashMapSt hashMapSt = new HashMapSt();

        MemberVO vo1 = new MemberVO(1001,"이지원");
        MemberVO vo2 = new MemberVO(1002,"홍지원");

        hashMapSt.addMember(vo1);
        hashMapSt.addMember(vo2);

        hashMapSt.showAllMember();

        hashMapSt.removeMember(1002);
        hashMapSt.showAllMember();
    }

}
