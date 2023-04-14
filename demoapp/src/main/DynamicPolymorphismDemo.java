package main;

import java.util.Scanner;

import bean.Circle;
import bean.Rectangle;
import bean.Shape;
import bean.Triangle;

public class DynamicPolymorphismDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape name");
        String shapeName = sc.next();
        sc.close();
        Shape shape = null;
        if(shapeName.equals("circle")) {
            shape = new Circle();
           // shape.area();
        }
        else if(shapeName.equals("triangle")) {
            shape = new Triangle();
            //shape.area();
        }
        else if(shapeName.equals("rectangle")) {
            shape = new Rectangle();
           // shape.area();
        }
        else {
            System.out.println("Invalid option");
        }

        if(shape!=null) {
            shape.area();
        }      
    }
}
