package ch03;

public class CalculateOperatorExample {
    public static void main(String[] args) {

        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2; // 자동 변환 후 연산

        long result2 = v1 + v2 - v4; // 자동 변환 후 연산

        double result3 = (double) v1/v2; // 강제 변환 후 연산


    }
}
