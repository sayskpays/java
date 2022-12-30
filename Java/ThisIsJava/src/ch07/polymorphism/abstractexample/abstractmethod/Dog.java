package ch07.polymorphism.abstractexample.abstractmethod;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
