package day7;

import java.util.ArrayList;

public class CourseListDemo2 {
    public static void main(String[] args) {

        int[] nums = {10,20,30,40};

        // for(int i=0;i<nums.length;i++) {
        //     System.out.println(nums[i]);
        // }

        for(int k : nums) {
            System.out.println(k);
        }

        String[] names = {"abc","bbb","ccc","ddd"};

        for(String s: names) {
            System.out.println(s);
        }

        ArrayList courses = new ArrayList();
        courses.add("java");
        courses.add("sql");
        courses.add("html");
        courses.add("css");

        System.out.println("Course List");
        for(Object obj: courses) {
            String s = (String) obj;
            System.out.println(s);
        }
    }
}
