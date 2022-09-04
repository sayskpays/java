package com.collection_framework.practice;

//  VO

public class MemberVO implements Comparable<MemberVO>{

    private int memberId;
    private String memberName;

    // HashSet에서 중복된 값이 들어가지 않도록 재정의
    @Override
    public int hashCode(){
        return memberId; // hashCode() 메서드가 회원 아이디를 반환하도록 재정의
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof MemberVO){
            MemberVO vo = (MemberVO)obj;
            if(this.memberId == vo.memberId) return true; // 매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면 true 반환
        }else{
            return false;
        }
        return false;
    }

    public MemberVO(int memberId, String memberName) {
        this.memberName = memberName;
        this.memberId = memberId;
    }
    public MemberVO(String memberName) {
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


    // Comparable class 구현
    @Override
    public int compareTo(MemberVO vo) {
        return (this.memberId - vo.memberId); // 비교 대상 : this의 회원아이디, compareTo() 메서드로 전달된 회원 아이디

        //비교하는 두 값 중 this값이 더 크면 양수를 반환 : 오름차순 정렬
        // this값이 더 작으면 음수를 반환 : 내림차순 정렬
    }

    // Comparator Class 구현
    /* 우선적으로 재정의 하기 위해서는 Comparator<E> 를 implements 해줘야 한다.*/
//    @Override
//    public int compare(MemberVO mem1, MemberVO mem2){
//        return mem1.getMemberId() - mem2.getMemberId();
//    }




}
