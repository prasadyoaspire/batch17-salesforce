package day7;

import java.util.Iterator;
import java.util.TreeSet;

import bean.Product;

public class ProductTreeSetDemo {
    public static void main(String[] args) {
        
        TreeSet<String> courses = new TreeSet<>(); //sorted set
        courses.add("java");
        courses.add("sql");
        courses.add("c++");
        courses.add("html");

        System.out.println(courses);

        Product p1 = new Product(10,"IPhoneX",95000);
        Product p2 = new Product(20,"IPhoneY",65000);
        Product p3 = new Product(30,"IPhoneZ",85000);
        Product p4 = new Product(40,"IPhoneX+",75000);
      
        TreeSet<Product> products = new TreeSet<>(); //sorted set
        products.add(p3);
        products.add(p4);
        products.add(p1);
        products.add(p2);       

        Iterator<Product> i = products.iterator();
        while(i.hasNext()) {
            Product product =  i.next();
            System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
            System.out.println("---------------------------");
        }
    }
}
