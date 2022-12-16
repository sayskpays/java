package ch05;

public class ArrayCreateByValueList {
    public static void main(String[] args) {
        // Filed
        int[] scores;
        scores = new int[]{83,90,87};
        int sum = 0;
        for(int i=0; i<scores.length; i++){
            sum += scores[i];
        }

        printItem(new int[]{50,60,70});
    }
    public static void printItem(int[] items){
        for(int i=0; i<items.length;i++){
            System.out.println("score["+i+"] : " + items[i]);
        }
    }
}
