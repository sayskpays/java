package ch18.data_io.object_stream;





import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws Exception{

        FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 객체 생성
        Member m1 = new Member("fail", "단풍이");
        Product p1 = new Product("hong",500);
        int[] arr1 = {1,2,3};

        // 객체를 직렬화해서 파일 저장
        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr1);

        oos.flush(); oos.close(); fos.close();

        FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 파일을 읽고 역직렬화해서 객체로 복원
        Member m2 = (Member) ois.readObject();
        Product p2 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close(); fis.close();

        // 복원된 객체 내용 확인
        System.out.println(m2);
        System.out.println(p2);
        System.out.println(Arrays.toString(arr2));

    }
}
