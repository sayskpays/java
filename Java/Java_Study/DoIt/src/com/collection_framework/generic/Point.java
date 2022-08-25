package com.collection_framework.generic;

public class Point<T,V> {
    T x;
    V y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }
}
