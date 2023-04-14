package main;

public class InstanceOfOperator {
    public static void main(String[] args) {

        X x1 = new X();

        X y1 = new Y();

        if(y1 instanceof Y) {
            System.out.println("yes");
        }   
        else {
            System.out.println("No");
        }     
    }
}

class X {
    void m1() {

    }
}

class Y  extends X {
    void m2() {

    }
}