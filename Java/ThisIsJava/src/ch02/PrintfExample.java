package ch02;

public class PrintfExample {
    public static void main(String[] args) {
        System.out.printf("이름: %1$s, 나이: %2$s\n", "홍준수", 25);

        int value = 123;

        System.out.printf("상품의 가격 : %d\n", value);
        System.out.printf("상품의 가격 : %6d\n", value);
        System.out.printf("상품의 가격 : %-6d\n", value);
        System.out.printf("상품의 가격 : %06d\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n",1, name, job);
    }
}

