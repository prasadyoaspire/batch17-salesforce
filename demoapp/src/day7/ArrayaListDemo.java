package day7;

import java.util.ArrayList;

public class ArrayaListDemo {
    public static void main(String[] args) {

        ArrayList courses = new ArrayList();
        courses.add("java");
        courses.add("sql");
        courses.add("html");
        courses.add("css");
        courses.add(2, "rdbms"); //index based
        courses.add("html"); // duplicates are allowed

        System.out.println(courses); //courses.toString()
    }
}
