package ch11.excep;



public class ExceptionHandlingMultipleExcep {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo"};

        for(int i=0; i<=arr.length; i++){

            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("arr["+i+"]" + value);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스 초과" + e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음" + e.getMessage());
            }
        }
    }
}
