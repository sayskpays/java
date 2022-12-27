package ch05;

public class MultidimensionalArrayByValueList {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        //첫 번째 반의 평균 점수 구하기
        int scoreSum = 0;
        for(int i=0; i<scores[0].length; i++){
            scoreSum += scores[0][i];
        }

        System.out.println(scoreSum);

        int easySum = 0;
        for(int a : scores[0]){
            easySum += a;
        }
        System.out.println(easySum);

        int totalStudent = 0;
        int totalSum = 0;

        for(int i=0; i<scores.length; i++){
            totalStudent += scores[i].length; // 반의 학생 수
            for(int j=0; j<scores[i].length; j++){
                totalSum += scores[i][j];
            }
        }







    }
}
