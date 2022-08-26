package com.collection_framework.set_interface;

import com.collection_framework.practice.MemberVO;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        MemberVO memberLee = new MemberVO(1001,"홍준수");
        MemberVO memberJun = new MemberVO(1002,"홍수");
        MemberVO memberSu = new MemberVO(1003,"수");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberJun);
        memberHashSet.addMember(memberSu);
        memberHashSet.showAllMember();

        MemberVO memberSoo = new MemberVO(1003,"수");
        memberHashSet.addMember(memberSoo);// 중복된 값이 들어감 MemberVO에서 hashCode, equals를 Overriding 해줘야 한다.
        memberHashSet.showAllMember();

    }
}
