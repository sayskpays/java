package ch12.obj_class.equals;

public class EqualsExample {
    public static void main(String[] args) {

        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        // 매개값이 Member 타입이고 id도 동일하므로 true
        if(obj1.equals(obj2)){
            ;
        }else{
            ;
        }
        // 매개값이 Member 타입이지만 id가 다르므로 false
        if(obj1.equals(obj3)){
            ;
        }
    }
}
