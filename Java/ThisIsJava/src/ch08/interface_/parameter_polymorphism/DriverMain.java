package ch08.interface_.parameter_polymorphism;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 매개값으로 구현 객체 대입 다형성 : 실행 결과가 다름
        driver.drive(bus);
        driver.drive(taxi);
    }
}
