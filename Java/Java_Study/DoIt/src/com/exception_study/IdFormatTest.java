package com.exception_study;

public class IdFormatTest {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws IdFormatException{
        if(userId == null){
            throw new IdFormatException("아이디는 null일 수 없습니다.");
        }else if(userId.length()< 8 || userId.length()> 20){
            throw new IdFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }
        this.userId = userId;
    }



    public static void main(String[] args) {

        IdFormatTest test = new IdFormatTest();

        String userId = null;

        String pass = new String("abc");
        System.out.println(pass.matches("[a-zA-Z]]+")); // 문자열로만 이루어졌는지 확인하는 메서드
        // true or false

        try{
            test.setUserId(userId);
        }catch(IdFormatException e){
            System.out.println(e.getMessage());
        }

        userId = "1234567";

        try{
            test.setUserId(userId);
        }catch (IdFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
