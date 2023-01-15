package ch05;

public class MultidimensionalArrayByNew {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        // 배열 항목 초기값 출력
        for(int i=0; i<mathScores.length; i++){
            for(int k=0; k<mathScores[i].length; k++){
                System.out.println("mathScores["+ i +"]["+ k + "]:"+mathScores[i][k]);
            }
        }
    }
}
