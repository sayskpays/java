package ch14.multi_thread.thread_safe_exit.interrupt_method.interrupt_check_method;

import ch14.multi_thread.thread_safe_exit.interrupt_method.PrintThread;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        thread.interrupt();
    }
}
