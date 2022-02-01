package generic.genericMethod;


public class genericMethodMain {
    public static void main(String[] args) {
        genericMethodVO<Integer> box1 = genericMethod01.<Integer>boxing(100);
        int intValue = box1.getT();

        genericMethodVO<String> box2 = genericMethod01.boxing("hong");
        String strValue = box2.getT();
        
    }
}
