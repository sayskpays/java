package ch08.interface_.parameter_polymorphism;

public class Driver {

    // 구현 객체가 대입될 수 있도록 매개변수를 인터페이스 타입으로 선언
    void drive(Vehicle vehicle){
        // 인터페이스 메소드 호출
        vehicle.run();
    }
}
