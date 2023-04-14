package main;

public class StringDemo2 {
    public static void main(String[] args) {
        String st1 = "raj";
        st1.concat("kumar");
        System.out.println("Fullname: "+st1);

        StringBuffer sb = new StringBuffer("Raj");
        sb.append("Kumar");
        System.out.println("fullname: "+sb);
    }
}
