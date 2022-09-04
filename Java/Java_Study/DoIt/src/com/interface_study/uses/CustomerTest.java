package com.interface_study.uses;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(); // Customer 클래스는 Buy형이자 Sell형 이기도 하다.

        Buy buyer = customer; // Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형 변환
        buyer.buy();    // buyer는 Buy 인터페이스의 메서드만 호출 가능


        /*
        *   Sell seller = new Customer()
        *   seller.sell()
        *
        *   이것과 하기 코드가 다른 점은 인스턴스가 새로 생성된다는 점.
        *   밑에 것은 단순 형변환이기 때문에 인스턴스가 새로 만들어지지 않는다.
        */

        Sell seller = customer;
        seller.sell();


        if(seller instanceof Customer){
            Customer customer2 = (Customer)seller; //seller를 하위 클래스형인 Customer로 DownCasting
            customer2.buy();
            customer2.sell();
        }

    }
}
