package main;

public class StringDemo3 {
    public static void main(String[] args) {
        String st = "Hello World!";
        char ch = st.charAt(7);
        System.out.println(ch);
        int index = st.indexOf("World");
        System.out.println(index);
        boolean isExist = st.contains("Worlddfdfdfd");
        if(isExist) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        String[] stAry= st.split(" ");
        System.out.println(stAry[0]);
        System.out.println(stAry[1]);

        String result = st.replace('l', '#');
        System.out.println(result);
        String result2 = st.replace("Hello", "olleH");
        System.out.println(result2);
    }
}
