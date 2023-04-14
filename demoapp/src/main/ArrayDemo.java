package main;

public class ArrayDemo {
    public static void main(String[] args) {
        
        int[] nums = new int[4];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
        char[] chs = new char[5];
        chs[0]= 'a';
        chs[1] = 'e';
        chs[2]= 'i';
        chs[3]= 'o';
        chs[4]= 'u';

        for(int i=0;i<chs.length;i++) {
            System.out.println(chs[i]);
        }    
    }
}
