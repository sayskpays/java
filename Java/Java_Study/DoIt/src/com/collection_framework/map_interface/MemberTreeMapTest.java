package com.collection_framework.map_interface;

import com.collection_framework.practice.MemberVO;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        var memberTreeMap = new MemberTreeMap();


        var memberLee = new MemberVO(1004,"이지원");
        var memberPark = new MemberVO(1003,"박서휜");

        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberLee);

        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMembers();
    }
}
