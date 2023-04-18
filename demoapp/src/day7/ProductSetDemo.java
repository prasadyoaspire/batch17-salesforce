package day7;

import java.util.HashSet;
import java.util.Iterator;

import bean.Product;

public class ProductSetDemo {
    public static void main(String[] args) {
        
        Product p1 = new Product(10,"IPhoneX",95000);
        Product p2 = new Product(20,"IPhoneY",65000);
        Product p3 = new Product(30,"IPhoneZ",85000);
        Product p4 = new Product(40,"IPhoneX+",75000);
        Product p5 = new Product(10,"IPhoneX",95000);

        HashSet<Product> products = new HashSet<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5); // p1 and p2 both are equals

        Iterator<Product> i = products.iterator();
        while(i.hasNext()) {
            Product product =  i.next();
            System.out.println("Id:"+product.getProductId());
            System.out.println("Name:"+product.getProductName());
            System.out.println("Price:"+product.getProductPrice());
            System.out.println("---------------------------");
        }
    }
}
