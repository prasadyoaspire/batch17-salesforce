package day6;

public class ThrowsDemo {
    public static void main(String[] args) {
        System.out.println("Main starts...");
        ThrowsDemo throwsDemo = new ThrowsDemo();
        try {
            int result =  throwsDemo.division(50, 0);
            System.out.println("Result: "+result);
        }
        catch(Exception e) {
            System.out.println("denominator should not be zero");
        }    
        System.out.println("Main ends...");        
    }

    public int division(int a, int b) throws ArithmeticException {
        int c = a/b;
        return c;
    }
}
