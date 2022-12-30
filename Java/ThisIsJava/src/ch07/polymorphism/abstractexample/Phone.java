package ch07.polymorphism.abstractexample;

public abstract class Phone {
    // field
    String owner;

    // constructor
    Phone(String owner){
        this.owner = owner;
    }

    //method

    void turnOn(){
        System.out.println("turnOn");
    }
    void turnOff(){
        System.out.println("turnOff");
    }

}
