package day7;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet courses = new TreeSet(); //sorted collection
        courses.add("java");
        courses.add("sql");
        courses.add("html");
        courses.add("css");
        courses.add("sql"); //duplicates not allowed
        System.out.println(courses);
    }
}
