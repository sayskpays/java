package ch14.multi_thread.thread_yield;

public class WorkThread extends Thread{

    // field
    public boolean work = true;

    // 생성자
    public WorkThread(String name){
        setName(name);
    }

    @Override
    public void run(){
        while(true){
            if(work){
                System.out.println(getName() + "작업처리");
            }else{
                Thread.yield();
            }
        }
    }
}
