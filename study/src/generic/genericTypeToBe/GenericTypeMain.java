package generic.genericTypeToBe;

public class GenericTypeMain {
    public static void main(String[] args) {
        
        // 타입 변환이 일어나지 않는다. String
        GenericType01<String> generic = new GenericType01<String>();
        generic.setT("hello");
        String str = generic.getT();

        System.out.println(str);

        // Integer
        GenericType01<Integer> genericInteger = new GenericType01<Integer>();
        genericInteger.setT(6);
        int value = genericInteger.getT();

        System.out.println(value);
        
    }

}
