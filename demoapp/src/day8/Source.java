package day8;

import java.util.regex.Pattern;

public class Source {
    public static void main(String[] args) {
        StringImpl stringImpl = new StringImpl();
        String result = stringImpl.validate("Hello*World");
        System.out.println(result);
        
    }
}

class StringImpl {
    //if input string contain only alphanumeric character 
    //return the string in upper case
    //else return "Invalid".
    public String validate(String st) {
        boolean result = Pattern.matches("[a-zA-Z0-9]+", st);
        if(result) {
            return st.toUpperCase();
        }
        else {
            return "Invalid";
        }
    }
}
