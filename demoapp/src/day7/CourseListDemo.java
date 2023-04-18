package day7;

import java.util.ArrayList;
import java.util.Iterator;

public class CourseListDemo {
    public static void main(String[] args) {
        
        ArrayList courses = new ArrayList();
        courses.add("java");
        courses.add("sql");
        courses.add("html");
        courses.add("css");

        System.out.println(courses.size());
        System.out.println(courses);

        Iterator i = courses.iterator();
        while(i.hasNext()) {
          // Object obj =  i.next();
          // String c = (String) obj;
          String c = (String) i.next();
           System.out.println(c);
        }    
    }
}
