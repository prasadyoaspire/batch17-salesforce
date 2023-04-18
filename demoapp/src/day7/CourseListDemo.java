package day7;

import java.util.ArrayList;
import java.util.Iterator;

public class CourseListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10); //nums.add(new Integer(10));
        nums.add(20); //nums.add(new Integer(20));
        nums.add(30);
        nums.add(40);

        Iterator<Integer> i1 = nums.iterator();
        while(i1.hasNext()) {
           Integer k =  i1.next();
           System.out.println(k);
        }
        
        ArrayList<String> courses = new ArrayList<>();
        courses.add("java");
        courses.add("sql");
        courses.add("html");
        courses.add("css");
       // courses.add(new Integer(10));
       // courses.add(new Double(10.2));

        Iterator<String> i = courses.iterator();
        while(i.hasNext()) {         
          String c = i.next();
           System.out.println(c);
        }    
    }
}
