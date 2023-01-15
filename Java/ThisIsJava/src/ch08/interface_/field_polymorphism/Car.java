package ch08.interface_.field_polymorphism;

public class Car {
    // filed
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    // method
    void run(){
        tire1.roll();
        tire2.roll();
    }
}
