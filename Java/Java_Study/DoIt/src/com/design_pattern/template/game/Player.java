package com.design_pattern.template.game;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new Beginner();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    // 모든 레벨(Beginner, Advanced, Super)이 매개 변수로 대입될 수 있기 때문에 모든 레벨의 상위 클래스인
    // PlayerLevel을 매개변수의 자료형(PlayerLevel을 상속받은 자식 클래스는 모두 가능)으로 받음
    public void upgradeLevel(PlayerLevel level){
        this.level = level; // 현재 자신의 level을 매개 변수로 받은 level로 변경 (Ex  Beginner -> Advanced )
        level.showLevelMessage();
    }

    public void play(int count){
        level.go(count);
    }// 다형성 활용
    /*
    *   하나의 코드가 다양한 자료형(Beginner, Advanced, Super)을 대상으로 동작
    * */
}
