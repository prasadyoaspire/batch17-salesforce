package day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import bean.Product;

public class ProductListDemo {
    public static void main(String[] args) {

        Product p1 = new Product(10,"IPhoneX",95000);
        Product p2 = new Product(20,"IPhoneY",65000);
        Product p3 = new Product(30,"IPhoneZ",85000);
        Product p4 = new Product(40,"IPhoneX+",75000);
        
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        // Iterator<Product> i = products.iterator();
        // while(i.hasNext()) {
        //    Product product =  i.next();
        //    System.out.println("Id:"+product.getProductId());
        //    System.out.println("Name:"+product.getProductName());
        //    System.out.println("Price:"+product.getProductPrice());
        //    System.out.println("---------------------------");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id");
        int pid = sc.nextInt();
        sc.close();

        //if product id is existing display name and price; 
        //else dispaly a message "product not existing with id".
        Iterator<Product> i1= products.iterator();
        boolean flag = false;
        while(i1.hasNext()) {
           Product p =  i1.next();
           if(p.getProductId() == pid) {
                flag = true;
                System.out.println("Name: "+p.getProductName());
                System.out.println("Price: "+p.getProductPrice());
                break;
           }          
        }
        if(flag == false) {           
            System.out.println("Product not existing with id: "+pid);
        }
    }
}
