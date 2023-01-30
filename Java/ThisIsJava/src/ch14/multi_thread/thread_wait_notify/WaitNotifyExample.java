package ch14.multi_thread.thread_wait_notify;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkOjbect workOjbect = new WorkOjbect(); // 공유 작업 객체 생성

        ThreadA threadA = new ThreadA(workOjbect); // 작업 스레드 생성 및 실행
        ThreadB threadB = new ThreadB(workOjbect);

        threadA.start();
        threadB.start();

    }
}
