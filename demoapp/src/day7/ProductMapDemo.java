package day7;

import java.util.HashMap;
import java.util.Scanner;

public class ProductMapDemo {
    public static void main(String[] args) {
        
        Product p1 = new Product("S101", "SamsungM50", 58000, "mobile");
        Product p2 = new Product("S102", "SonyTV", 128000, "television");
        Product p3 = new Product("I101", "IPhoneX", 98000, "mobile");
        Product p4 = new Product("D101", "DellXP", 88000, "laptop");
        Product p5 = new Product("L101", "LG20", 98000, "laptop");

        HashMap<String,Product> products = new HashMap<>();
        products.put("S101", p1);
        products.put("S102", p2);
        products.put("I101", p3);
        products.put("D101", p4);
        products.put("L101", p5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code");
        String code = sc.next();
        sc.close();

        Product product =  products.get(code);

        if(product!= null) {
            System.out.println("Product Details");
            System.out.println("Name: "+product.getProductName());
            System.out.println("Price: "+product.getProductPrice());
            System.out.println("Category: "+product.getCategory());
        }
        else {
            System.out.println("product not existing with code "+code);
        }       
    }
}
