package chapter13_multiThread;

public class ClacThread extends Thread{
    
    //Constructor
    public ClacThread(String name){
        setName(name);
    }

    public void run(){
        for(int i=0 ; i<100; i++){

        }
        //해당 쓰레드 이름 출력
        System.out.println(getName());
    }
    

}
