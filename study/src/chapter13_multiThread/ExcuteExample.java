package chapter13_multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteExample {
    public static void main(String[] args) {
        //최대 스레드 개수가 2인 스레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //작업 정의
        for(int i=0; i<10 ; i++){
            Runnable runnable = new Runnable(){
                @Override
                public void run(){
                    //스레드 총 개수 및 작업 스레드 이름 출력
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();

                    System.out.println("총 스레드 개수 : " + poolSize );
                    System.out.println("작업 스레드 이름 :" + threadName);

                    //예외 발생
                    int value = Integer.parseInt("삼");
                }
            };

            //작업 처리 요청
            executorService.execute(runnable);
            //executorService.submit(runnable);

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.getMessage();
            }
        }//for

        //스레드 풀 종료
        executorService.shutdown();
    }
    
}
