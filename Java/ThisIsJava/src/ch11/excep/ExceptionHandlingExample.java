package ch11.excep;

public class ExceptionHandlingExample {

    public static void printLength(String data){


        try {
            int result = data.length();
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("마무리");
        }
    }
    public static void main(String[] args) {
        printLength("This Is Java");
        printLength(null);

        try {
            // ClassPath 위치에서 주어진 클래스를 찾는 코드
            Class.forName("java.lang.String");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
