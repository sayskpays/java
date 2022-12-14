package ch03;

public class AccuracyExample {
    public static void main(String[] args) {
        /*
        *  사과 1개를 0.1 단위의 10조각으로 보고, 그 중 7조각 (0.7)을 뺀 0.3을 result 변수에 저장
        * */

        // bad code
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit; // 0.29999999999993


        // good code
        int goodApple = 1;
        int totalPieces = goodApple * 10;
        int goodNumber = 7;

        int goodResult = totalPieces - number;
        System.out.println("10조각에서 남은 조각"+ goodResult);
        System.out.println("사과 1개에서 남은 양"+ goodResult/10.0);


    }
}
