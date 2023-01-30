package ch14.multi_thread.thread_safe_exit;

public class SafeStopExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printThread.setStop(true);
    }
}
