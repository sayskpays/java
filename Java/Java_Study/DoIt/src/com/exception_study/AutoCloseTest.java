package com.exception_study;

public class AutoCloseTest {
    public static void main(String[] args) {

        try(AutoCloseObj obj = new AutoCloseObj(); AutoCloseObj obj2 = new AutoCloseObj(); ) {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
