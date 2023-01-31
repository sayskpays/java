package ch14.multi_thread.thread_safe_exit.interrupt_method.interrupt_check_method;

public class PrintThread extends Thread {
    @Override
    public void run() {

        while (true) {
            System.out.println("실행중");
            if (Thread.interrupted()) {
                break;
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
