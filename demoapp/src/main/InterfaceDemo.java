package main;

public class InterfaceDemo {
    public static void main(String[] args) {
       // MyClass myClass = new MyClass();
       MyInterface myClass = new MyClass();
        myClass.m1();
        myClass.m2();
        System.out.println("PI vlaue: "+MyInterface.PI);
        myClass.m3();
        MyInterface.m4();

    }
}

interface MyInterface {
    double PI = 3.14; //public static final
    void m1();
    void m2();
    default void m3() {
        System.out.println("default methods in interface");
    }
    static void m4() {
        System.out.println("static methods in interface");
    }
}
class MyClass implements MyInterface {

    @Override
    public void m1() {
        System.out.println("m1 implementation");
    }
    @Override
    public void m2() {
        System.out.println("m2 implementation");
    }
}
