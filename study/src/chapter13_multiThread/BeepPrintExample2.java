package chapter13_multiThread;

import java.awt.Toolkit;

//메인 스레드와 작업 스레드가 동시에 실행
public class BeepPrintExample2 {
    public static void main(String[] args) {

        // 1. Runnable 상속 받은 클래스 따로 분리하여 이용
        
        // Runnable beepTask = new BeepTask();
        // Thread thread = new Thread(beepTask);

        
        // 2. Runnable 익명 객체 이용
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run(){
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++){
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        });

        // 3. 람다식 이용

        Thread thread1 = new Thread(()->{
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i=0; i<5; i++){
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
        });

        thread.start();
        thread1.start();
        
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
