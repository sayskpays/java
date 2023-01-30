package ch14.multi_thread.thread_wait_notify;

public class ThreadA extends Thread{
    private WorkOjbect workOjbect;

    public ThreadA(WorkOjbect workOjbect) {
        setName("ThreadA");
        this.workOjbect = workOjbect;
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            workOjbect.methodA();
        }
    }
}
