package generic.genericMethod;

public class genericMethod01 {
    
    //Static method
    public static <T> genericMethodVO<T> boxing(T t){
        genericMethodVO<T> box = new genericMethodVO<T>();
        
        box.setT(t);
        return box;
        
    }
}
