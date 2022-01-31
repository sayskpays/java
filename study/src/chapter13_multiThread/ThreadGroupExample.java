package chapter13_multiThread;

public class ThreadGroupExample {

    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");


        workThreadA.start();
        workThreadB.start();

        System.out.println("main thread 그룹의 list 메소드 내용 출력");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();

        

    }
    
}
