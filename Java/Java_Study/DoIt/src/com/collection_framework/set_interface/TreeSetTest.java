package com.collection_framework.set_interface;

import com.collection_framework.practice.MemberVO;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

       MemberTreeSet memberTreeSet = new MemberTreeSet();

        MemberVO vo1 = new MemberVO(1003,"박서휜");
        MemberVO vo2 = new MemberVO(1004,"이지원");
        MemberVO vo3 = new MemberVO(1005,"손민국");

        memberTreeSet.addMember(vo1);
        memberTreeSet.addMember(vo2);
        memberTreeSet.addMember(vo3);

        memberTreeSet.showAllMember();

        MemberVO vo4 = new MemberVO(1003,"홍길동");
        memberTreeSet.addMember(vo4);
        memberTreeSet.showAllMember();

        /*
        * 이렇게 TreeSet을 구현할때 어떤 기준으로 노드를 비교하여 트리를 형성해야 하는지 구현 해야함
        * -> Comparable 인터페이스, Comparator 인터페이스 사용
        *
        * */

    }
}
