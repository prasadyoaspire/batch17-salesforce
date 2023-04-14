package main;
public class SuperRefDemo {
    public static void main(String[] args) {        
        X x1 = new Y();
        x1.m1();
        //x1.m2();
        Y y1 = (Y)x1;
        y1.m2();
    }
}
class X {
    void m1() {
        System.out.println("m1 inside X");
    }
}
class Y extends X {
    @Override
    void m1() {
        System.out.println("m1 inside Y");
    }
    void m2() {
        System.out.println("m2 inside Y");
    }
}
