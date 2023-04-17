package day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckExceptionDemo {
    public static void main(String[] args) throws ClassNotFoundException,FileNotFoundException{
        System.out.println("Main starts...");

        Class.forName("A"); // throws checked exception need to follow the rule: either handle or declare

        FileReader fr = new FileReader("D:\\trainings\\capgemini\\batch17-salesforceabc.txt"); // throws checked exception

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // throws unchecked exception no need to follow the rule

        System.out.println("Main ends...");

    }
}
