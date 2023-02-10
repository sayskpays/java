package ch16.lambda_expressions.lambda_ex.annony_lambda_change;

public class Button {
    // 정적 멤버 인터페이스
    @FunctionalInterface
    public static interface ClickListener{
        // 추상 메소드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메소드
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }
}
