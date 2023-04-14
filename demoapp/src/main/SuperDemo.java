package main;

public class SuperDemo {
    public static void main(String[] args) {
        B b1 = new B();
    }
}
class A {
    A() {
     System.out.println("A calss zero args constructor");
    }
    A(int i) {
        System.out.println("A calss int args constructor");
    }
 }

class B extends A {
 B() {
   super(10);
    System.out.println("B calss zero agrs constructor");
  }
}