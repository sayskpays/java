package ch09.anonymous_obj.overlap_interface;

public class Button {

    // 정적 중첩 인터페이스
    public static interface ClickListener{
        // 추상 메소드
        void onClick();
    }

    // field
    private ClickListener clickListener;

    //method
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    // Button이 클릭 되었을 때 실행하는 메소드 선언
    public void click(){
        this.clickListener.onClick();
    }
}
