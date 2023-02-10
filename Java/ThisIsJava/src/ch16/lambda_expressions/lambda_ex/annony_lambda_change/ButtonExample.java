package ch16.lambda_expressions.lambda_ex.annony_lambda_change;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok 버튼 객체에 람디식 (ClickListener 익명 구현 객체) 주입
        btnOk.setClickListener(()-> System.out.println("OK 버튼 클릭"));

        // Ok 버튼 클릭하기
        btnOk.click();

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 람다식 (ClickListener 익명 구현 객체) 주입
        btnOk.setClickListener(()-> System.out.println("Cancel 버튼 클릭"));

        // Cancel 버튼 클릭
        btnCancel.click();
    }
}
