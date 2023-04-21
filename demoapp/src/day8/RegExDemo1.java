package day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {
    public static void main(String[] args) {
        String input1 ="at";
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher(input1);
        boolean result1 = m.matches();
        System.out.println(result1);

        //2nd approach
        String input2 = "k$ty";
        boolean result2 = Pattern.matches("..t", input2);
        System.out.println(result2);

        boolean result3 = Pattern.matches("[abc]", "b");
        System.out.println("result3 : "+result3);

        boolean result4 = Pattern.matches("[a-zA-Z _-]+", "a w-eA_e");
        System.out.println("result4: "+result4);

        boolean result5 = Pattern.matches("[a-zA-Z]{10}", "aweAe");
        System.out.println("result5: "+result5);

        boolean result6 = Pattern.matches("[a-zA-Z]{5,10}", "aweArdfederf");
        System.out.println("result6: "+result6);

        boolean result7 = Pattern.matches("[a-zA-Z0-9]{5,10}", "aweAe4S");
        System.out.println("result7: "+result7);

       // boolean result8 = Pattern.matches("[789][0-9]{9}", "8956237410");
        boolean result8 = Pattern.matches("[789][\\d]{9}", "5956237410");
        System.out.println("Mobile: "+result8);
    }
}