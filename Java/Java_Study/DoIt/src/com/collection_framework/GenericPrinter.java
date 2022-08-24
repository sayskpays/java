package com.collection_framework;


/*
*   T의 자료형이 결정되는 시점은 제네릭 클래스의 인스턴스가 생성되는 순간.
*   static 변수나 메서드는 인스턴스를 생성하지 않아도 클래스 이름으로 호출할 수 있어서(인스턴스 변수 사용 불가)
*   static 변수의 자료형이나 static 메서드 내부 변수의 자료형으로 T를 사용할 수 없다.
*
*/


public class GenericPrinter<T extends Material> {
    private T material;


    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }

}
