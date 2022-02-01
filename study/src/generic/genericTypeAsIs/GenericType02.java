package generic.genericTypeAsIs;

public class GenericType02 {
    
    public static void main(String[] args) {
        GenericType01 generic = new GenericType01();
        // String -> Object 자동 타입 변환
        generic.setObject("hong");
        // Object -> String 강제 타입 변환
        String name = (String)generic.getObject();

        // GenericType03 -> Object 자동 타입 변환
        generic.setObject(new GenericType03());
        // Object -> GenericType03 강제 타입 변환
        GenericType03 genericType03 = (GenericType03)generic.getObject();
        
    }
    
    

}
