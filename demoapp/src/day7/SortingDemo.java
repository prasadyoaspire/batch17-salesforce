package day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortingDemo {
    public static void main(String[] args) {
        int[] nums = {25,30,15,42,10,29};

        Arrays.sort(nums);

        for(int n: nums) {
            System.out.println(n);
        }

        List<Integer> numsList = new ArrayList<>();
        numsList.add(50);
        numsList.add(25);
        numsList.add(42);
        numsList.add(15);

        Collections.sort(numsList);

        System.out.println(numsList);
    }
}
