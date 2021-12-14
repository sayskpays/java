package test.ja_va;

public class test04 {

    public static void main(String[] args) {

        int firstDice = 0;
        int secondDice = 0;
        boolean result = true;

        while (result) {
            //
            if (firstDice + secondDice != 5) {
                // 주사위 돌리기
                firstDice = (int) (Math.random() * 6) + 1;
                secondDice = (int) (Math.random() * 6) + 1;

                System.out.println((firstDice) + "," + (secondDice));
            } else if (firstDice + secondDice == 5) {
                result = false;
                System.out.println("합이 5가 나와서 주사위 돌리기 종료");
            }
        }

    }

}
