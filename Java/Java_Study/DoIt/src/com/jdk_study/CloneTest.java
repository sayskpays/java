package com.jdk_study;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Clone circle = new Clone(10,20,30);
        Clone copyCircle = (Clone)circle.clone();

        System.out.println(circle==copyCircle);
        System.out.println(circle.equals(copyCircle));

        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));

    }
}
