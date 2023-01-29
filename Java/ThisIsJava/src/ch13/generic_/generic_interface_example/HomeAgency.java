package ch13.generic_.generic_interface_example;

// 타입 파라미터 T를 Home 객체로 대체
public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home(); // 리턴 타입이 반드시 Home이어야 함
    }
}
