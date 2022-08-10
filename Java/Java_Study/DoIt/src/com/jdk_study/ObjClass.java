package com.jdk_study;

public class ObjClass {
}

/*
*   Object Class 메서드
*
*
* 1. String toString() : 객체를 문자열로 표현하여 반환합니다. 재정의하여 객체에 대한 설명이나 특정 멤버 변수 값을 반환합니다.
* 2. boolean equals(Object obj) : 두 인스턴스가 동일한지 여부를 반환합니다. 재정의하여 논리적으로 동일한 인스턴스임을 정의할 수 있습니다.
* 3. int hashCode() : 객체의 해시 코드 값을 반환 합니다.
* 4. Object clone() : 객체를 복사하여 동일한 멤버 변수 값을 가진 새로운 인스턴스를 생성합니다.
* 5. Class getClass() : 객체의 Class를 반환 합니다.
* 6. void finalize() : 인스턴스가 힙 메모리에서 제거될 때 gc에 의해 호출되는 메서드. 네트워크 연결 해제, 열려 있는 파일 스트림 해제 구현
* 7. void wait() : 멀티스레드 프로그램에서 사용하는 메서드. 스레드를 기다리는 상태로 만듭니다.
* 8. void notify() : wait() 메서드에 의해 기다리고 있는 스레드를 실행 가능한 상태로 가져 옵니다.
*
*  final이 붙은 메서드는 재정의하여 사용할 수 없다.
*
* */
