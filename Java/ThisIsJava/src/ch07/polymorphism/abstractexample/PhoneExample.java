package ch07.polymorphism.abstractexample;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();
    }
}
