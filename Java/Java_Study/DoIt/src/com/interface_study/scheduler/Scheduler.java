package com.interface_study.scheduler;

/*
*   1. 순서대로 배분하기 : 모든 상담원이 동일한 상담 건수를 처리하도록 들어오는 전화 순서대로 상담원에게 하나씩 배분
*   2. 짧은 대기열 찾아 배분하기 : 고객 대기 시간을 줄이기 위해 상담을 하지 않는 상담원이나 가장 짧은 대기열을 보유한 상담원에게 배분
*   3. 우선순위에 따라 배분하기 : 고객 등급에 따라 등급이 높은 고객의 전화를 우선 가져와서 업무 능력이 좋은 상담원에게 우선 배분
*
*
* */

public interface Scheduler {

    public void getNextCall(); // 다음 전화를 가져오는 기능
    public void sendCallToAgent(); // 상담원에게 전화를 배분하는 기능


}
