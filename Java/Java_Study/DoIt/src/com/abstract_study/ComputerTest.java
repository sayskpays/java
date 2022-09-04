package com.abstract_study;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer();
        Computer c2 = new DeskTop();
        //Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();

    }
}

/*
*   추상 클래스는 인스턴스로 생성할 수 없다. (c1, c3 에러 발생)
*
*   구현 메서드 : 하위 클래스에서 공통으로 사용할 구현 코드. 하위 클래스에서 재정의할 수도 있음.
*   추상 메서드 : 하위 클래스가 어떤 클래스냐에 따라 구현 코드가 달라짐
*
*
* */
