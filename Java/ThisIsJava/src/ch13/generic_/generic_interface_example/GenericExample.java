package ch13.generic_.generic_interface_example;

public class GenericExample {
    public static void main(String[] args) {

        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}
