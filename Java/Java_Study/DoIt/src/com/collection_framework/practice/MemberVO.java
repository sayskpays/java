package com.collection_framework.practice;

//  VO

public class MemberVO {

    private int memberId;
    private String memberName;

    public MemberVO(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString(){
        return memberName + "회원님의 아이디는" + memberId + "입니다.";
    }
}
