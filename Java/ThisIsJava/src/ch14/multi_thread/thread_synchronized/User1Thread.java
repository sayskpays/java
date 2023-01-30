package ch14.multi_thread.thread_synchronized;

public class User1Thread extends Thread{
    private Calculator calculator;

    public User1Thread() {
        setName("User1Thread");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    } // 외부에서 공유 객체인 Calculator를 받아 필드에 저장

    @Override
    public void run(){
        calculator.setMemory1(100);
    }
}
