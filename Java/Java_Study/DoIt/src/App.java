import com.example.InnerMethod;
import com.example.Oop;

public class App {
    public static void main(String[] args) throws Exception {

        // Oop.class

        Oop a = new Oop(123,"Hong");
        // a.showStudentInfo();
        a.divide(0,0);

        // InnerMethod.class

        InnerMethod test = new InnerMethod();
        test.setStudentName("HongJunSoo");

        System.out.println(test.getStudentName());

    }



}
