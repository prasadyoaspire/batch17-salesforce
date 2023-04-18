package day7;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //ordered collection which maintains insertion order
        LinkedHashSet courses = new LinkedHashSet(); 
        courses.add("java");
        courses.add("sql");
        courses.add("html");
        courses.add("css");
        courses.add("sql"); // duplicates not allowed

        System.out.println(courses);
    }
}
