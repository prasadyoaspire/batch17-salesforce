package main;

public class ArrayDemo2 {
    public static void main(String[] args) {
        
     String[] courses = new String[4];
     courses[0] = "java";
     courses[1] = "html";
     courses[2] = "css";
     courses[3] = "js";

     for(int i=0;i<courses.length;i++) {
        System.out.println(courses[i]);
     }

    }
}
