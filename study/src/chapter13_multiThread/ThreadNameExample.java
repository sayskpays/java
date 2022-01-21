package chapter13_multiThread;

public class ThreadNameExample {
    
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("main Thread Name :" + mainThread);

        ThreadA threadA = new ThreadA();
        System.out.println("작업 스레드 이름 : " + threadA.getName());
        threadA.start();

        ThreadB threadB = new ThreadB();
        System.out.println("작업 스레드 이름 : " + threadB.getName());
        threadB.start();

        
    }
}
