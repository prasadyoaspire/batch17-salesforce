package day5;

public class ToStringDemo {
    public static void main(String[] args) {

        int i = 10;
        A a1 = new A(10);
        System.out.println("i = "+i);
        System.out.println("a1 = "+a1);   // a1.toString() called 
        a1.m1();    
        
        String s = new String("hello");
        System.out.println("s= "+s); // s.toString() called
    }
}
