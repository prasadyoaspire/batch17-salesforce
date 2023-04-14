package main;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter productId: ");
        int productId = sc.nextInt();
        System.out.println("Enter product name: ");
        String productName = sc.next();
        System.out.println("Enter product price: ");
        double productPrice = sc.nextDouble();
        sc.close();
        System.out.println("Id: "+productId);
        System.out.println("Name: "+productName);
        System.out.println("Price: "+productPrice);
    }
}
