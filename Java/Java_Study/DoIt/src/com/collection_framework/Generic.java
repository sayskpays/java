package com.collection_framework;

/*
*   변수나 메서드의 자료형을 필요에 따라 다른 자료형으로 바꿀 수 있다.
*
*
*   class 구성은 동일하나, 자료형만 다른 경우,
*
* ===============================================================
*   public class ThreeDPrinter{
*       private Powder material;
*
*       public void setMaterial(Powder material){
*           this.material = material;
*       }
*
*       public Powder getMaterial(){
*           return material;
*       }
*
* ================================================================
*
*   public class ThreeDPrinter{
*       private Plastic material;
*
*       public void setMaterial(Plastic material){
*           this.material = material;
*       }
*
*       public Plastic getMaterial(){
*           return material;
*       }
*   }
*
* ===============================================================
* -> 상단의 두개의 클래스를 만드는 것은 비효율적
*     변수의 자료형을 Object로 사용한다.
*
*
* ===============================================================
*
*   public class ThreeDPrinter{
*       private Object material;
*
*       public void setMaterial(Object material){
*           this.material = material;
*       }
*
*       public Object getMaterial(){
*           return material;
*       }
*   }
* ===============================================================
*
* 사용법
*
* ThreeDPrinter printer = new ThreeDPrinter();
* Powder p1 = new Powder();
* printer.setMaterial(p1); // 자동 형변환
*
* Powder p2 = (Powder)printer.getMaterial(); // 직접 형변환
*
*
* ===============================================================
*
* 이러한 번거로움 때문에 사용하는 것이 제네릭,
*   여러 참조 자료형이 쓰일 수 있는 곳에 특정한 자료형을 지정하지 않고,
*   클래스나 메서드를 정의한 후 사용하는 시점에 어떤 자료형을 사용할 것인지 지정하는 방식
*
*
*/

import java.util.ArrayList;


public class Generic {

    public static void main(String[] args) {

        var list = new ArrayList<String>();

        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<Powder>();
        powderGenericPrinter.setMaterial(new Powder());
        Powder powder = powderGenericPrinter.getMaterial();
        System.out.println(powderGenericPrinter);

        /*
        // 제네릭에서 대입된 자료형을 명시하지 않은 경우
        GenericPrinter<Object> generic = new GenericPrinter<>();
        generic.setMaterial(new Powder());
        Powder powder1 = (Powder)generic.getMaterial();
        System.out.println("powder1 : " + powder1);
        */
        // T 자료형에 사용할 자료형을 제한하는 <T extends 클래스>
        // Material class에서 추상 클래스를 선언 Powder class에서 메소드를 오버라이딩 해주고 GenericPrinter Class에서 제네릭 타입에 extends를 둔다.







    }


}
