package ch08.interface_.interface_Inheritance;

public class InterfaceMain {
    public static void main(String[] args) {

        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();


    }
}
