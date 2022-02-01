package generic.genericMethodExample;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer , String>p1 = new Pair<Integer,String>(1,"apple");
        Pair<Integer , String>p2 = new Pair<Integer,String>(1,"apple");
        // 구체적인 타입을 명시적으로 지정
        boolean result = Util.<Integer,String>compare(p1, p2);
        if(result){
            System.out.println("논리적으로 동등한 객체 입니다.");
        }else{
            System.out.println("논리적으로 동등하지 않은 객체 입니다.");
        }

        Pair<String , String>p3 = new Pair<String,String>("h","apple");
        Pair<String , String>p4 = new Pair<String,String>("a","apple");
        // 구체적인 타입을 추정
        boolean resultSet = Util.compare(p3, p4);
        if(resultSet){
            System.out.println("논리적으로 동등한 객체입니다.");
        }else{
            System.out.println("논리적으로 동등하지 않은 객체 입니다.");
        }

        
        
    }
}
