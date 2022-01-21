package chapter13_multiThread;

public class ThreadA extends Thread{
    
    //Constructor
    public ThreadA(){
        setName("ThreadA");
    }

    public void run(){
        for(int i=0; i<2; i++){
            System.out.println(getName() + "가 출력한 내용");
        }
    }
    
}
