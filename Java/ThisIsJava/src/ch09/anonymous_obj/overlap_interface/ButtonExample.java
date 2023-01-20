package ch09.anonymous_obj.overlap_interface;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btn = new Button();

        // 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        class BtnListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Button Click");
            }
        }// BtnListener

        btn.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {}
        }); // 위의 코드와 동일하지만 익명 구현 객체로 구현하는 것이 더욱 간결


        // 버튼 객체에 ClickListener 구현 객체 주입
        btn.setClickListener(new BtnListener());

        btn.click();


        // ---------------------------------------------------------

        Button btnCancel = new Button();

        // Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        class CancelListener implements Button.ClickListener{

            @Override
            public void onClick() {
                System.out.println("Cancel button click");
            }
        }// CancelListener

        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {

            }
        }); // 위의 코드와 동일하지만 익명 구현 객체로 구현하는 것이 더욱 간결

        // Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new CancelListener());

        // Cancel 버튼 클릭하기
        btnCancel.click();


    }//main
}//class
