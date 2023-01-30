package ch14.multi_thread.thread_safe_exit;

// 스레드 안전 종료 조건 이용 방법
public class PrintThread extends Thread{
    private boolean stop;

    public void setStop(boolean stop){
        this.stop = stop;
    }

    @Override
    public void run(){
        while(!stop){
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }

}
