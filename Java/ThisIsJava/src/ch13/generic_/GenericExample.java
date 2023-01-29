package ch13.generic_;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);

        // ------------------------------------------

        Box box3 = new Box();
        box3.content = "100";

        Box box4 = new Box();
        box4.content = "100";

        Box box5 = new Box();
        box5.content = 100;

        boolean result1 = box3.compare(box4);
        System.out.println(result1);

        boolean result2 = box3.compare(box5);
        System.out.println(result2);


    }
}
