package com.access;


// 접근 제어자 적용 : 내부 변수, 메서드, 생성자

/*
*   protected : 같은 패키지 내부 or  상속 관계의 클래스만 접근 가능
*   default : 같은 패키지
*   private : 같은 클래스
*/
public class Access_1 {

    int age;

    // private 가 붙으면 getter setter를 사용해야 한다.
    private int birth;


    public int getBirth() {
        return birth;
    }

    // 정보 은닉을 사용하는 이유는 값에 대입하는 값을 제한할 수 있고 잘못된 값이 입력하는 것을 사전에 방지 하기 위해서
    public void setBirth(int birth) {
        if(birth <= 12){
            this.birth = birth;
        }else{
            System.out.println("Please Correctly Insert DATA.");
        }
    }


}
