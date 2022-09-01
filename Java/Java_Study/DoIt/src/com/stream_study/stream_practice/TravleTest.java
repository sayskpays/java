package com.stream_study.stream_practice;


import java.util.ArrayList;
import java.util.List;

/* 테스트 시나리오
*
* 1. 고객의 명단 출력
* 2. 여행의 총 비용 계산
* 3. 고객 중 20세 이상인 사람의 이름을 정렬하여 출력
*
* */
public class TravleTest {
    public static void main(String[] args) {

        CustomerVO customerHong = new CustomerVO("Hong",40,100);
        CustomerVO customerLee = new CustomerVO("Lee",70,150);
        CustomerVO customerChoi = new CustomerVO("Choi",30,120);

        List<CustomerVO> customerList = new ArrayList<>();

        customerList.add(customerHong);
        customerList.add(customerLee);
        customerList.add(customerChoi);

        System.out.println("== 고객 명단 추가된 순서대로 출력 == ");
        customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));

        int total = customerList.stream().mapToInt(c->c.getPrice()).sum(); // 중간 연산 mapToInt 후 최종연산 sum 값 변수에 저장
        System.out.println("총 여행 비용은: "+ total);

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream().filter(c->c.getAge()>=20)
                .map(c->c.getName()).sorted().forEach(s-> System.out.println(s));


    }
}
