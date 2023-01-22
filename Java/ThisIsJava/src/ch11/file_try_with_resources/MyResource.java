package ch11.file_try_with_resources;

public class MyResource implements AutoCloseable{

    // field
    private String name;

    // constructor
    public MyResource(String name){
        this.name = name;
        System.out.println("MyResource 열기");
    }

    // method
    public String read1(){
        return "100";
    }
    public String read2(){
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyResource 닫기");
    }


}
