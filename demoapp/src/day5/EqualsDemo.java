package day5;

public class EqualsDemo {
    public static void main(String[] args) {
       // String st1 = new String("hello");
       // String st2 = new String("hello");
       String st1 = "Hello";
       String st2 = "Hello";
        if(st1.equals(st2) ) {
            System.out.println("both are equals");
        }
        else {
            System.out.println("both are not equals");
        }

        A a1 = new A(10);
        A a2 = new A(10);

        if(a1.equals(a2) ) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }

    }
}
