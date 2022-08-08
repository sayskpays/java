package com.design_pattern.template.game;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    final public void go(int count){
        run();
        for(int i=0; i < count; i++){
            jump();
        }
        turn();
    }

}//class

/*
*   run, jump, turn, showLevelMessage 메서드는 클래스마다 조금씩 다르게 구현되기 때문에 추상 메서드로 선언
*/
