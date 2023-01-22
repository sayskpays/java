package ch11.file_try_with_resources;


public class TryWithResourceExample {
    public static void main(String[] args) {
        try(MyResource res = new MyResource("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();

        try(MyResource res = new MyResource("A")){
            String data = res.read2();
            // NumberFormatException 발생
            int value = Integer.parseInt(data);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();

        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");
        try(res1; res2){
            String data1 = res1.read1();
            String data2 = res2.read1();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
