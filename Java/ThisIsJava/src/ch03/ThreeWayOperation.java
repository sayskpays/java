package ch03;

public class ThreeWayOperation {
    public static void main(String[] args) {
        int score = 85;

        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B':'C');
        System.out.printf("%c : %d", grade,score);
    }
}
