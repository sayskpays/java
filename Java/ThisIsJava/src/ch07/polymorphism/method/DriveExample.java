package ch07.polymorphism.method;

public class DriveExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        driver.drive(bus);
    }
}
