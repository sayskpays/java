package com.inheritance.methodoveride;


/*
*   오버라이딩 조건
*
*   0. 자식 클래스에서 선언 or
*   1. return 형
*   2. 메서드 이름
*   3. 매개 변수 개수
*   4. 매개변수 자료형
*
*   모두 일치
*
*
*   EX) 부모 클래스
*   public int calPrice(int price){
        bonusPoint += price * bonusRatio; // 보너스 포인트 계산
        return price;
    }

    * EX) 자식 클래스
    *   @Override
        public int calPrice(int price){
            bonusPoint += price * bonusRatio;
            return  price - (int)(price * saleRatio);
        }
    *
*
*
*
* */

public class OverideStudy {
}
