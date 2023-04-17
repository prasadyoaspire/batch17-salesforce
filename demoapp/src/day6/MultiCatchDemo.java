package day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchDemo {
    public static void main(String[] args) {
        System.out.println("Main starts...");
       
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
        catch(ArithmeticException e) {
            System.out.println("denominator should not be zero");
        }
        catch(InputMismatchException e) {
            System.out.println("Pass correct type of value");
        }
        System.out.println("Main Ends...");

    }
}
