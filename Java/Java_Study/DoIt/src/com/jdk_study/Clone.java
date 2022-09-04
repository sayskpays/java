package com.jdk_study;

class Point{

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = " + x + "," + "y =" + y;
    }
}

public class Clone implements Cloneable{ // 객체를 복제해도 된다는 의미로 Cloneable 인터페이스를 함께 선언
    Point point;
    int radius;

    public Clone(int x,  int y , int radius) {
        point = new Point(x,y);
        this.radius = radius;
    }

    public String toString(){
        return "원점은" + point +"반지름은"+radius;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{ // clone() 메서드를 사용할 때 발생할 수 있는 오류를 예외 처리함
        return super.clone();
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Clone){
            Clone clone = (Clone)obj;
            if(this.point.x == clone.point.x && this.point.y == clone.point.y && this.radius == clone.radius) {
                return true;
            }
        }
        return false;
    }
}
