package day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A value");
            int a = sc.nextInt();
            System.out.println("Enter b value");
            int b = sc.nextInt();
            sc.close();
            int c = a/b;
            System.out.println("result = "+c);
        }
        catch(ArithmeticException | InputMismatchException e) {
             System.out.println(e.getMessage()) ;
        }
        finally {
            System.out.println("finally block");
        }
    }
}
