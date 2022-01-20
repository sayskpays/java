package chapter13_multiThread;

public class WorkerThread_12_2_2 extends Thread{
    @Override
    public void run(){
        // 스레드가 실행할 코드
        
    }
    Thread thread = new WorkerThread_12_2_2();


    //익명 객체
    Thread thread1 = new Thread(){
        public void run(){
            // 스레드가 실행할 코드
        }
    };

    
}
