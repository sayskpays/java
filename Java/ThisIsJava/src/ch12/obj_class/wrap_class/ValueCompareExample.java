package ch12.obj_class.wrap_class;

public class ValueCompareExample {
    public static void main(String[] args) {

        Integer obj1 = 300;
        Integer obj2 = 300;

        String data = "123";
        int a = Integer.parseInt(data);

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
    }
}
