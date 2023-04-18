package day7;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet courses = new HashSet(); //unordered collection
        courses.add("java");
        courses.add("sql");
        courses.add("html");
        courses.add("css");
        courses.add("sql"); //duplicates are not allowed
        
        System.out.println(courses);
    }
}
