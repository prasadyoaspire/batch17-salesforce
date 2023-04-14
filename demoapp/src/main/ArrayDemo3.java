package main;

import bean.Product;

public class ArrayDemo3 {
    public static void main(String[] args) {

        Product product1 = new Product(10, "IphoneX", 85000);
        Product product2 = new Product(20, "IphoneY", 75000);
        Product product3 = new Product(30, "IphoneZ", 65000);
        
        Product[] products = new Product[3];
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;

        for(int i=0;i<products.length;i++) {
            System.out.println(products[i].getProductId()+" "+products[i].getProductName()+" "+products[i].getProductPrice());
        }
    }
}
