package com.collection_framework.map_interface;

import com.collection_framework.practice.MemberVO;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapSt {

    private HashMap<Integer, MemberVO> hashMap;

    public HashMapSt(){
        hashMap = new HashMap<>();
    }

    // HashMap에 회원을 추가하는 메서드
    public void addMember(MemberVO member){
        hashMap.put(member.getMemberId(),member); // key 값은 회원 아이디, value는 회원 클래스
    }

    // HashMap에서 회원을 삭제하는 메서드
    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){ // HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId+"가 존재하지 않습니다");
        return false;
    }

    // Iterator를 사용해 전체 회원을 출력하는 메서드
    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator(); // memberId 기준으로 순회 함
        while(ir.hasNext()){ // 다음 key가 있으면
            int key = ir.next(); // key 값을 가져와서
            MemberVO member = hashMap.get(key); // key로 부터 value 가져오기
            System.out.println(member);
        }
        System.out.println();
    }
}
