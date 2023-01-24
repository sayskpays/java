package ch11.throws_exception.custom_define_excep;

/*
* 다음 예제는 Account 클래스의 withdraw 메소드에서 balance 필드와 출금액을 비교해 잔고가 부족하면 InsufficientException을 발생시키고 throws 한다.
그리고 AccountExample은 withdraw() 메소드를 호출할 때 예외 처리를 한다.
* */

public class Account {
    private long balance;


    public long getBalance() {
        return balance;
    }

    // Method
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money) throws InsufficientException{
        if(balance < money){
            throw new InsufficientException("잔고 부족: "+(money - balance) + " 모자람 ");
        }
        balance -= money;
    }


}
