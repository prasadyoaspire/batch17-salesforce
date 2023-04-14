package main;

public class OverridingDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeNoise();
    }
}
abstract class Animal {
    abstract public void makeNoise();
}
class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Mow Mow Mow");
    } 
}

