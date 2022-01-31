package chapter13_multiThread;

public class WorkThread extends Thread{
    //Constructor
    public WorkThread(ThreadGroup threadGroup, String threadName){
        super(threadGroup, threadName);
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
            
        }
    }

}
