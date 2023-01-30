package ch14.multi_thread.thread_wait_notify;

public class ThreadB extends Thread{
    private WorkOjbect workOjbect;

    public ThreadB(WorkOjbect workOjbect) {
        setName("ThreadB");
        this.workOjbect = workOjbect;
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            workOjbect.methodB();
        }
    }
}
