package chapter13_multiThread;

//메인 스레드와 작업 스레드가 동시에 실행
public class BeepPrintExample2 {
    public static void main(String[] args) {

        //BeepTask class implement Runnable
        
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);

        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("thing");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}
