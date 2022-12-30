package ch07.polymorphism.abstractexample;

public class SmartPhone extends Phone{


    // constructor
    SmartPhone(String owner) {
        super(owner);
    }

    // method
    void internetSearch(){
        System.out.println("Search internet");
    }

}
