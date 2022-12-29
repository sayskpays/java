public class Test3 {
    public static void main(String[] args) {

        Test test = new Test2();

        test.method1();

        Test2 newTest = (Test2)test;
        System.out.println(newTest.test1Value);
        System.out.println(newTest.test2Val);


    }
}
