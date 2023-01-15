package ch08.interface_.multiple_interface;

public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();

        // RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
        rc.turnOn();
        rc.turnOff();

        // Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
        Searchable searchable = new SmartTelevision();
        searchable.search("");
    }
}
