package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import bean.Product;

public class ComparatorDemo {
    public static void main(String[] args) {

        Product p1 = new Product(10,"IPhoneX",95000);
        Product p2 = new Product(20,"IPhoneY",65000);
        Product p3 = new Product(30,"IPhoneZ",85000);
        Product p4 = new Product(40,"IPhoneX+",75000);
      
        List<Product> products = new ArrayList<>(); //sorted set
        products.add(p3);
        products.add(p4);
        products.add(p1);
        products.add(p2);  

        System.out.println("sort by product name:");
        
        Collections.sort(products);

        Iterator<Product> i = products.iterator();
        while(i.hasNext()) {
            Product product =  i.next();
            System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
            System.out.println("---------------------------");
        }

        System.out.println("sort by product price:");
        PriceComparator pComparator = new PriceComparator();
        Collections.sort(products, pComparator);

        Iterator<Product> i1 = products.iterator();
        while(i1.hasNext()) {
            Product product =  i1.next();
            System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
            System.out.println("---------------------------");
        }

        System.out.println("sort by product id:");
        NumberComparator nComparator = new NumberComparator();
        Collections.sort(products, nComparator);

        Iterator<Product> i3 = products.iterator();
        while(i3.hasNext()) {
            Product product =  i3.next();
            System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
            System.out.println("---------------------------");
        }        
    }
}

class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        //sort by price
        int result = (int) (o1.getProductPrice()-o2.getProductPrice());
        return result;
    }
}

class NumberComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        //sort by id
        int result = o1.getProductId()-o2.getProductId();
        return result;
    }
}

class NameComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        //sort by name
        int result = o1.getProductName().compareTo(o2.getProductName());
        return result;
    }
}




