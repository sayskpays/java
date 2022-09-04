package com.collection_framework.iterator;

import com.collection_framework.practice.MemberVO;
import com.collection_framework.practice.arraylist.MemberArrayList;

import java.util.ArrayList;
import java.util.Iterator;


/*
 * 순서가 없는 Set 인터페이스를 구현한 경우에는 get(i) 메서드 사용 불가.
 * 이때 Iterator를 사용
 *
 * boolean hashNext() : 이후에 요소가 더 있는지를 체크하는 메서드이며, 요소가 있다면 true를 반환
 * E next() : 다음에 있는 요소를 반환합니다.
 *
 */
public class IterTest {
    public static void main(String[] args) {


    }

    public boolean removeMember(int memberId) {
        var list = new ArrayList();
        Iterator<MemberVO> ir = list.iterator();

            while (ir.hasNext()) {    // 요소가 있는 동안
                MemberVO member = ir.next();    // 다음 회원을 반환 받음
                int tempId = member.getMemberId();
                if (tempId == memberId){
                    list.remove(member);
                    return true;
                }
            }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;

    }
}
