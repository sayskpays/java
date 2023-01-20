package ch09.anonymous_obj.annonymous_object_example.anno_imple_obj;

public class Home {
    // 필드에 익명 구현 객체 대입
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {}
        @Override
        public void turnOff() {}
    };

    // 메소드(필드 이용)
    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }
    /////////////////////////////////////////////////////

    //메소드(로컬 변수 이용)
    public void use2(){
        // 로컬 변수에 익명 구현 객체 대입
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {}
            @Override
            public void turnOff() {}
        };
        rc.turnOn();
        rc.turnOff();
    }
    /////////////////////////////////////////////////////

    // 메소드(매개변수 이용)
    public void use3(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();
    }
}
