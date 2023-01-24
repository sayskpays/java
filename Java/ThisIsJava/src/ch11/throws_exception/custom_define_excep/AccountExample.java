package ch11.throws_exception.custom_define_excep;

public class AccountExample {
    public static void main(String[] args) {
        Account acc = new Account();

        // 예금하기
        acc.deposit(10000);
        System.out.println("예금액 :" + acc.getBalance());

        // 출금하기
        try{
            acc.withdraw(30000);
        }catch (InsufficientException e){
            System.out.println(e.getMessage());
        }
    }
}
