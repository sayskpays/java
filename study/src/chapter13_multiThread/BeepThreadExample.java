package chapter13_multiThread;

import java.awt.Toolkit;

public class BeepThreadExample {
    public static void main(String[] args) {
        //extends Thread객체
        //Thread thread = new BeepThread();


        /* Thread를 상속받는 클래스를 따로 만들어 사용하지 않고 한 클래스 내에서 익명객체를 이용하여
            스레드를 생성하는 방법
        */
        Thread thread = new Thread(){
            @Override
            public void run(){
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5 ; i++){
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        };

        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("thing");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }


    }
    
}
