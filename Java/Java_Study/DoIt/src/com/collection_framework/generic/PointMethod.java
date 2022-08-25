package com.collection_framework.generic;

public class PointMethod {
    // 제네릭 메서드
    // public <자로형 매개변수> 반환형 메서드 이름(자료형 매개변수){}
    public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2){
        double left = (Double) p1.getX();
        double right = (Double)p2.getX();
        double top = (Double)p1.getY();
        double bottom = (Double)p2.getY();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }

    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<>(0,0.0);
        Point<Integer, Double> p2 = new Point<>(10,10.0);

        double rect = PointMethod.<Integer, Double>makeRectangle(p1,p2);

        System.out.println(rect);

    }
}
