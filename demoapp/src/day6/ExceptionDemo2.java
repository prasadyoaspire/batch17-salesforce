package day6;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("Main Starts...");
        int a = 20;
        int b = 0;
        try {
            int c = a/b; 
            //if exception occur, jre creates an exception object and throws it.
            //which exception object jre creates ?
              // -> ArithmeticException ae = new ArithmeticException();
            //how it throws ?
             // -> throw ae;
            System.out.println("c = "+c);
        }
        catch(ArithmeticException e) {
            System.out.println("denominator should not be zero");
        }      
        System.out.println("Main Ends...");
    }
}
